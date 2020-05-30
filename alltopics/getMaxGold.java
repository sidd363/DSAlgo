
public class getMaxGold {
    public int getMaximumGold(int[][] grid) {
       
        int r = grid.length;
        int c = grid[0].length;
        
        int max =0;

		boolean [][]visited = new boolean[r][c];
        for(int i = 0; i<r; i++) {
        	for(int j=0; j<c; j++) {
        		
        		if(grid[i][j]>0) {
        			int tmp =  dfs(grid, visited, i,j,r,c);
        			max = Math.max(max, tmp);
        			System.out.println(" max "+ max+  " tmp "+ tmp);
        		}
        	}
        }
        return max;
    }
    private int dfs(int [][] grid, boolean [][] visited, int i, int j, int r, int c) {
    	//boundary check 
    	if(i<0 || j>=c || i>=r || j<0 || visited[i][j] || grid[i][j]==0) {
    		return 0;
    	}
    
    	
    	
    	int self = grid[i][j];
    	visited[i][j]=true;
    	
    	int left = dfs(grid, visited, i,j+1, r,c);
    	int right = dfs(grid, visited, i,j-1, r,c);
    	int up = dfs(grid, visited, i-1,j, r,c);
    	int down = dfs(grid, visited, i+1,j, r,c);
    	
    	int tmp = Math.max(Math.max(left, right) , Math.max(up, down));
    	self+= tmp;
    	visited[i][j]=false;
    	
    	return self;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMaxGold obj = new getMaxGold();
		int [][] grid = {{0,6,0},{5,8,7},{0,9,0}};
		
		
		System.out.println(obj.getMaximumGold(grid));
		//[[0,6,0],[5,8,7],[0,9,0]]

	}

}
