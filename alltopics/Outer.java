
import java.util.*;

public class Outer {


	   public int countServers(int[][] grid) {
	        //
		    int ans = 0;
		    int r = grid.length;
		    
		    if(grid ==null || r==0|| grid[0].length==0 ) {
		    	return 0;
		    }
		    int c = grid[0].length;
		    int []rcopy = new int[r]; 
		    int []ccopy = new int[c]; 
		    
		    for(int i=0;i<r;i++) {
		    	for(int j=0;j<c;j++) {
		    		if(grid[i][j]==1) {
		    			rcopy[i]++;
		    			ccopy[j]++;
		    			ans++;
		    		}
		    	
		    	}
		    }
		   // System.out.println("  ans "+ ans);
		    
		    for(int i=0;i<r;i++) {
		    	for(int j=0;j<c;j++) {
		    		if(grid[i][j]==1 && rcopy[i]==1 && ccopy[j]==1) {
		    			//System.out.println( " i"+i +" and j "+j);
		    			ans--;
		    		}
		    	
		    	}
		    }
		    
		    
		    		
	        return ans;
	   }
	   
	   
	   public static void main(String []a) {
		   Outer ot = new Outer();
		   //
		  

		   int[][] grid = { 
				   {1,1,1,0},
				   {0,0,0,1}};
		   //int[][] grid = { {1,0,0,1,0},
//				   			{1,1,0,0,0},
//				   			{0,0,0,1,0}
//				   			};
	  
		   System.out.println(ot.countServers(grid));
		   
	   }
	

}
