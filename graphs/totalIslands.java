package graphs;

public class totalIslands {
	
    public static int numIslands(char[][] grid) {
        int ans =0;
        int r = grid.length;
        int c = grid[0].length;
        
        boolean [][] visited = new boolean[r][c];
        for(int i=0;i<r;i++) {
        		for(int j=0;j<c;j++) {
        			if(grid[i][j]=='1' && !visited[i][j]) {
        				dfsutil(grid, i, j, r, c, visited);
        				ans++;
        				
        			}
        		}
        }
        return ans;
    }
	private static void dfsutil(char[][] grid, int i, int j, int r, int c, boolean[][] visited) {
		// TODO Auto-generated method stub
		
		if(i<0 || i>=r || j<0 || j>=c || visited[i][j]==true) {
			return;
		}
		if(grid[i][j]=='1') {
		    visited[i][j]=true;
			dfsutil(grid, i+1, j, r, c, visited);
			dfsutil(grid, i, j+1, r, c, visited);
			dfsutil(grid, i-1, j, r, c, visited);
			dfsutil(grid, i, j-1, r, c, visited);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] grid = {{'1', '1' ,'0' ,'0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
			
		System.out.println(" total islands are "+ numIslands(grid));
				
			
	}

}
