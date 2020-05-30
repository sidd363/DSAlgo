package backtracking;

//Given a 2D board and a word, find if the word exists in the grid.
//
//The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
//
//Example:
//
//board =
//[
//  ['A','B','C','E'],
//  ['S','F','C','S'],
//  ['A','D','E','E']
//]
//
//Given word = "ABCCED", return true.
//Given word = "SEE", return true.
//Given word = "ABCB", return false.
		
		
public class wordSearch {
	int found;
	public boolean exist(char[][] board, String word) {
		int r = board.length;
		int c = board[0].length;
		boolean[][]visited = new boolean[r][c];
		found = 0;
		for(int i =0;i<r;i++) {
			for(int j =0;j<c;j++) {
				if(board[i][j]==word.charAt(0)) { 
					dfs(board, word, 0, r, c, i, j , visited);
					if(found>0) {
						return true;
					}
				}
			}
		}
		
		
		if (found>0) {  
			return true;
		}
		//System.out.println(" found main "+ found);
		return false;
    }
	
	private void dfs(char[][] board, String word, int index, int r, int c, int i , int j, boolean[][]visited) {
		// TODO Auto-generated method stub
		if(index == word.length() || found >0 ) {
			//System.out.println(" found");
			found++;
			return;
		}
		if(i<0 || i>=r || j<0|| j>=c || visited[i][j]) {
			return;
		}else {
			System.out.println(" index length "+ index + " word "+ word + " board "+ board[i][j]);
			if(board[i][j]==word.charAt(index)) {
				index++;
			}else {
				index = 0;
				// return added to handle timeout cases
				return;
			}
			visited[i][j] = true;
			dfs(board, word, index, r, c, i, j+1, visited);
			dfs(board, word, index, r, c, i, j-1, visited);
			dfs(board, word, index, r, c, i+1, j, visited);
			dfs(board, word, index, r, c, i-1, j, visited);
			visited[i][j] = false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wordSearch ws = new wordSearch();
		char [][]board ={
					{'A','B','C','E'},
					{'S','F','C','S'},
					{'A','D','E','E'}
					};
		
		
	//	char [][]board ={{'a','b'}};
				//"ba"
		System.out.println(ws.exist(board, "ABCCED"));
		
		
	}

}
