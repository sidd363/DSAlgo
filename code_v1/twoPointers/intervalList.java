package twoPointers;
import java.util.*;

public class intervalList {
	
    public static int[][] intervalIntersection(int[][] A, int[][] B) {
    	List<int[]> ans = new ArrayList();
    	int m = A.length, n = B.length;
    	
    	int i =0 , j=0;
    	while(i<m && j<n) {
    		int low = Math.max(A[i][0], B[j][0]);
    		int high = Math.min(A[i][1], B[j][1]);
    		
    		if(low<=high) {
    			ans.add(new int []{low, high});
    		}
    		//eliminate the shorter group
    		if(A[i][1]< B[j][1]) {
    			i++;
    		}else {
    			j++;
    		}
    	}
    	
    	int [][]ansint = ans.toArray(new int[ans.size()][]);
		return ansint;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a = new int[][]{{0, 2}, {5, 10}, {13, 23},{24,25}};
		int [][]b = new int[][]{{1, 5}, {8, 12}, {15, 24},{25,26}};
		//A = [[0,2],[5,10],[13,23],[24,25]], B = [[1,5],[8,12],[15,24],[25,26]]
		int [][] ans = intervalIntersection(a, b);
		
		for(int i =0;i<ans.length;i++) {
			//for(int j = 0;j<ans[i].length;j++) {
				System.out.print(" each row "+ ans[i][0]+ "  "+ ans[i][1]);
			//}
			System.out.println();
		}
	}

}
