package backtracking;
//The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
//Given an integer n, return all distinct solutions to the n-queens puzzle.
//Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
import java.util.*;
public class nqueen {
	
	boolean colcheck[];
	boolean d1check[];
	boolean d2check[];
	 public List<List<String>> solveNQueens(int n) {
		 List<List<String>> ans = new ArrayList<List<String>>();
		 List<String> inner = new ArrayList<String>(); 
		
		 colcheck =  new boolean[n];
		 d1check = new boolean[2*n-1];
		 d2check = new boolean[2*n-1];
		 
		 dfs(ans, inner, n, 0);
		 
		 return ans;
	 }

	private void dfs(List<List<String>> ans, List<String> inner, int n,  int row) {
		// TODO Auto-generated method stub
		if(row == n) {
			ans.add(new ArrayList<String>(inner));
			return;
		}else {
			for(int col=0;col<n;col++) {
				if(colcheck[col] || d1check[col+row] || d2check[n-1+col-row] ) {
					continue;
				}
				char [] in = new char[n];
				Arrays.fill(in, '.');
				//placing queue at this column 
				// considering grid of size 3 there will be 5 diagonal of 45 deg and 135 degree each
				// for each i and j their corresponding diag can be found by i+j and size-1+j-i;
				in[col]='Q';
				
				inner.add(new String(in));
				colcheck[col]=true;
				d1check[col+row] = true;
				d2check[n-1+col-row] = true;
				
				//calling recursively
				dfs(ans, inner, n, row+1);
				
				//backtrack here 
				inner.remove(inner.size()-1);
				colcheck[col]=false;
				d1check[col+row] = false;
				d2check[n-1+col-row] = false;
			}
		}
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nqueen obj = new nqueen();
		System.out.println("diff ways are "+obj.solveNQueens(4));

	}

}
