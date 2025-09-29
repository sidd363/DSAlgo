

import java.util.LinkedList;
import java.util.Queue;

/*
Given an N x N grid containing only values 0 and 1, where 0 represents water and 1 represents land, find a water cell such that its distance to the nearest land cell is maximized and return the distance.

The distance used in this problem is the Manhattan distance: the distance between two cells (x0, y0) and (x1, y1) is |x0 - x1| + |y0 - y1|.

If no land or water exists in the grid, return -1.
*/
public class FarFromLand1162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,0,1},{0,0,0},{1,0,1}};
		
		FarFromLand1162 o = new FarFromLand1162();
		
		o.maxDistance(a);
		
	}

	
	public void maxDistance(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                	System.out.println(" 1 cor "+i + " j cor "+ j);
                    visited[i][j] = true;
                    queue.offer(new int[]{i, j});
                }
            }
        }
        int[][] dirs = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
        int res = -1;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            System.out.println("-----------------");
            System.out.println(" polled x cor"+cell[0]+" y cor  "+cell[1] );
            
            for (int[] dir: dirs) {
                int x = cell[0] + dir[0];
                int y = cell[1] + dir[1];
                
                if (x >= 0 && x <n && y >= 0 && y < n && !visited[x][y]) {
                	    System.out.println(" x cor"+x+" y cor"+y +" ele is "+ grid[x][y]);
                    visited[x][y] = true;
                    grid[x][y] = grid[cell[0]][cell[1]] + 1;
                    res = Math.max(grid[x][y], res);
                    queue.offer(new int[]{x, y});
                }
            }
        }
        int ans = res > 0? res - 1: -1;
        System.out.println(" ans is "+ans);
    }

}
