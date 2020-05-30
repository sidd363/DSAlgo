

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class mincostpathgfg {

	private static int mincostpathgfg(int[][] grid, int r) {
		
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[] {0,0});
		boolean[][] visited = new boolean[r][r];
		
		int[] dirs = {-1,0,0,-1,0,1,1,0};
	
		int [][] dist = new int[r][r];
		for(int  i=0;i<r;i++) {
			for(int  j=0;j<r;j++) {
				dist[i][j] = Integer.MAX_VALUE;
			}
		}
		dist[0][0]=grid[0][0];
	
		while(!q.isEmpty()) {
			 //int s = q.size();
			 
			 //while(s-- >0) {
				 int[] tmp = q.poll();
				 int x = tmp[0];
				 int y = tmp[1];
                 
                 if(!visited[x][y]) {
                	 visited[x][y]=true;
                	 
                	 for(int i=0;i<dirs.length;i=i+2) {
    					 int dx =x+dirs[i];
    					 int dy = y+dirs[i+1];
    	
    					 
    					 if(dx>=0 && dx<r && dy>=0 && dy<r  ) {
    						 
    						 if(dist[dx][dy] > dist[x][y] + grid[dx][dy] ) {
    							 if(dist[dx][dy]!=Integer.MAX_VALUE) {
    								 visited[dx][dy] = false;
        						 }
    							 dist[dx][dy] = dist[x][y] + grid[dx][dy];
    							 q.add(new int[] {dx,dy});
    							 
    						 }
    						 
    					 }
    				 }
                 }
				 
			// }
			 
			 
		 }
		return dist[r-1][r-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t-->0) {
			 int r = sc.nextInt();
			 
			 int n = r*r;
			 
			 int[][] grid = new int[r][r];
			 
			 
			 for(int i =0;i<r;i++) {
				 for(int j =0;j<r;j++) {
					 
					 int bc = sc.nextInt();
					 grid[i][j]= bc;
					 
					 
				 }
			 }
			 
			System.out.println( mincostpathgfg(grid, r));
			 
		 }
	}

}
