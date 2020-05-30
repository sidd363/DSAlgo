

import java.util.*;
public class asFarAsFromLand {
	public int myfun(int[][] grid) {
		int ans = -1;
	
		int r = grid.length;
		if(r==0 ||  grid[0]==null) {
			return 0;
		}
    	int c = grid[0].length;
    	
    	// find all sources
    	Queue<int[]>q = new LinkedList<int[]>();
    	
    	for(int i =0;i<r;i++) {
    		for(int j = 0;j<c;j++) {
    			if(grid[i][j]==1) {
    				q.offer(new int[] {i,j});
    			}
    		}
    	}
    	//System.out.println(" q . size"+ q.size());
    	
    	if(q.size()==0) {
    		return -1;
    	}
    	boolean[][] visited =new boolean[r][c]; 
    	while(!q.isEmpty()) {
    		int s = q.size();
    	
	    		while(s>0) {
	    			
	    			int [] tmp = q.poll();
	    			int x = tmp[0];
	    			int y = tmp[1];
	                //ans = Math.max(ans, grid[x][y] - 1);
	    			
	    			if(x-1>=0 && !visited[x-1][y] ) {
	    				
	    				q.offer(new int[] {x-1,y});
	    				visited[x-1][y] = true;
	    				
	    				//grid[x-1][y] = grid[x][y]+1;
	    				//k++;
	    				
	    			}
	    			if(y-1>=0 && !visited[x][y-1] ) {
	    				q.offer(new int[] {x,y-1});
	    				//l++;
	    				//grid[x][y-1] = grid[x][y]+1;
	    				visited[x][y-1] = true;
	    			}
	    			if(x+1<r  && !visited[x+1][y]  ) {
	    				q.offer(new int[] {x+1,y});
	    				//m++;
	    				//grid[x+1][y] =grid[x][y]+1;
	    				visited[x+1][y] = true;
	    			}
	    			if(y+1<c   && !visited[x][y+1] ) {
	    				q.offer(new int[] {x,y+1});
	    				visited[x][y+1] = true;
	    				//grid[x][y+1] =grid[x][y]+1;
	    				//n++;
	    			}
	    			
	    			
	    			s--;
	    		}
	    		ans++;
    		
    		
    	}       
    	
		return ans <=0 ? -1: ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[[0,1,0],[0,0,0],[0,0,1]]

		  // int[][] grid = { {1,1,1,0},[
		// [[1,0,1],[0,0,0],[1,0,1]]
				 //  {0,0,0,1}};
		   int[][] grid = { {1,0,1},
				   			{0,0,0},
				   			{1,0,1}
				   			};
		   
//		   int[][] grid = {{1,1,1,1,1},
//		    {1,0,0,0,1},
//		    {1,0,1,0,1},
//		    {1,0,0,0,1},
//		    {1,1,1,1,1}};
		   asFarAsFromLand sb = new asFarAsFromLand();
		   System.out.println(sb.myfun(grid));
	}
}
