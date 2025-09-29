import java.util.*;
public class shortestBridge {
    public int shortestBridgeFind(int[][] grid) {
    	int r = grid.length;
    	int c = grid[0].length;
    	
    	colorgrid(grid, r, c);
    	
    	// this will mark only one island with 2
    	
    	Queue<int[]> q = new LinkedList<>();
    	
    	// now add all marked with 2 as source in queue and then perform bfs over it
    	for(int i =0;i<r;i++) {
    		for(int j =0;j<c;j++) {
    			
    			if(grid[i][j]==2) {
    				q.add(new int[] {i,j});
    			}
    			
    		}
    	}
    	
    	//go for bfs bro
    	int bridge =0;
    	boolean[][] visited = new boolean[r][c];
    	while(!q.isEmpty()) {
    		
    		int s = q.size();
    		
    		while(s>0) {
    			int [] tmp = q.poll();
    			int x = tmp[0];
    			int y = tmp[1];
    			
    			if(grid[x][y]==1) {
    				return bridge-1;
    			}
    			
    			// go thorugh all four directions
    			if(x-1>=0 && !visited[x-1][y]) {
    				q.offer(new int[] {x-1,y});
    				visited[x-1][y] = true;
    			}
    			if(y-1>=0 && !visited[x][y-1]) {
    				q.offer(new int[] {x,y-1});
    				visited[x][y-1] = true;
    			}
    			if(x+1<r && !visited[x+1][y]) {
    				q.offer(new int[] {x+1,y});
    				visited[x+1][y] = true;
    			}
    			if(y+1<c && !visited[x][y+1]) {
    				q.offer(new int[] {x,y+1});
    				visited[x][y+1] = true;
    			}
    			s--;
    			
    		}
    		bridge++;
    				
    	}
    	
        return -1;
    }
    private void colorgrid(int[][] grid, int r, int c ) {
    	for(int i =0;i<r;i++) {
    		for(int j =0;j<c;j++) {
    			
    			if(grid[i][j]==1) {
    				//System.out.println(" start "+ i + " j "+j);
    				dfs(grid, i,j);
    				return ;
    			}
    			
    		}
    	}
    }
    private void dfs(int [][] grid, int i, int j) {
    	//check for boundary
    	//System.out.println("i  "+ i + " and j "+j);
    	if(i<0 || i>=grid.length || j<0 || j>= grid[0].length || grid[i][j]!=1 ) {
    		//System.out.println("breaking condition ");
    		return;
    	}
    	if(grid[i][j]==1) {
    		grid[i][j]=2;
    	}
    	dfs(grid, i+1,j);
    	dfs(grid, i-1,j);
    	dfs(grid, i,j+1);
    	dfs(grid, i,j-1);
    	return;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[[0,1,0],[0,0,0],[0,0,1]]

		  // int[][] grid = { {1,1,1,0},
				 //  {0,0,0,1}};
//		   int[][] grid = { {0,1,0},
//				   			{0,0,0},
//				   			{0,0,1}
//				   			};
		   
		   int[][] grid = {{1,1,1,1,1},
		    {1,0,0,0,1},
		    {1,0,1,0,1},
		    {1,0,0,0,1},
		    {1,1,1,1,1}};
		   shortestBridge sb = new shortestBridge();
		   System.out.println(sb.shortestBridgeFind(grid));
	}

}
