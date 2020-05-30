
public class noOfIslands200 {
    public static int numIslands(char[][] grid) {
    	if(grid==null || grid.length==0){
            return 0;
        }
    	int nr = grid.length;
    	int nc = grid[0].length;
    	
    	int ans=0;
    	for(int i=0;i<nr;i++) {
    		for(int j=0;j<nc;j++) {
    			if(grid[i][j]=='1') {
    				ans++;
    				recurs(i,j,grid);
    			}
    		}
    	}
        return ans;
    }
    public static void recurs(int r, int c, char[][] grid) {
    	if(r<0 || r>=grid.length || c<0|| c>=grid[0].length || grid[r][c]=='0') {
    		return;
    	}
    	grid[r][c]='0';
    	recurs(r,c+1,grid);
    	recurs(r+1,c,grid);
    	recurs(r-1,c,grid);
    	recurs(r,c-1,grid);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char c [][] = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'}
//		,{'0','0','0','0','0'}};
		
		char c[][]= new char[0][0];
		
		System.out.println(numIslands(c));
	}
//		11110
//		11010
//		11000
//		00000
}
