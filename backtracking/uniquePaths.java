package backtracking;


//On a 2-dimensional grid, there are 4 types of squares:
//
//1 represents the starting square.  There is exactly one starting square.
//2 represents the ending square.  There is exactly one ending square.
//0 represents empty squares we can walk over.
//-1 represents obstacles that we cannot walk over.
//Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.
public class uniquePaths {
	int ans;
	
    public int uniquePathsIII(int[][] grid) {
        ans = 0;
        int r = grid.length;
        int c = grid[0].length;
        
        int sr = 0, sc=0;
        for(int i=0;i<r;i++) {
        	   for(int j=0;j<c;j++) {
        		   if(grid[i][j]==1) {
        			   sc=j;
        			   sr=i;
        			   break;
        		   }
        	   }
        }
        boolean [][] visited = new boolean[r][c];
        
        dfs(visited, grid, sr, sc, r, c);
        
        return ans;
    }
    private void dfs(boolean[][] visited, int[][] grid, int i, int j, int r, int c) {
		// TODO Auto-generated method stub
    	    if(i<0 || i>=r || j<0 || j>=c || visited[i][j] || grid[i][j]==-1) {
			return;
		}else if(grid[i][j]==2) {
			if (check(grid)) {
			    ans++ ;
			}
			return;
		}else {
    	    
			visited[i][j] = true;
			//if (grid[i][j]==0) 
		    grid[i][j]= 3;
			dfs(visited, grid, i+1, j, r, c);
			dfs(visited, grid, i-1, j, r, c);
			dfs(visited, grid, i, j+1, r, c);
			dfs(visited, grid, i, j-1, r, c);
			grid[i][j]=0;
			
			visited[i][j] = false;
	
		}
		
		
		
	}
    
    
	private boolean check(int [][] grid) {
    		int r = grid.length;
        int c = grid[0].length;
	    	for(int i=0;i<r;i++) {
	     	   for(int j=0;j<c;j++) {
	     		   if(grid[i][j]==0) {
	     			   //System.out.println(" i and j "+i +" j "+j);
	     			   return false;
	     		   }
	     	   }
	     }
	    	return true;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int [][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
		//[[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
        uniquePaths obj = new uniquePaths ();
		System.out.println(obj.uniquePathsIII(grid));
	}

}
