package graphs;

public class minPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		
		System.out.println(" total islands are "+ numIslands(grid));
	}

	private static int numIslands(int[][] grid) {
		// TODO Auto-generated method stub
		
		int r = grid.length;
		if(r<1) {
			return 0;
		}
		int c = grid[0].length;
		int mat [][] = new int [r][c];
		mat[0][0] = grid[0][0];
		for(int i =1;i<r;i++) {
			mat[i][0] = grid[i][0] +  mat[i-1][0];
		}
		for(int i =1;i<c;i++) {
			mat[0][i] = grid[0][i]+ mat[0][i-1];
		}
		
		for(int i = 1;i<r;i++) {
			for(int j = 1;j<c;j++) {
				mat[i][j]= Math.min(mat[i][j-1], mat[i-1][j])+ grid[i][j];
			}
		}
		return mat[r-1][c-1];
		//return 0;
	}

}
