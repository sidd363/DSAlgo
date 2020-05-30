
import java.util.*;

public class gfgPathExist {

	
	//4
	//3 0 0 0 0 3 3 0 0 1 0 3 0 2 3 3 
	//3
	//0 3 2 3 0 0 1 0 0
	private static int pathexist(int[][] grid, int []target, int r, Queue<int[]> q) {
		
		 
		boolean[][] visited = new boolean[r][r];
		
		int[] dirs = {-1,0,0,-1,0,1,1,0};
		 
		while(!q.isEmpty()) {
			 int[] tmp = q.poll();
			 int x = tmp[0];
			 int y = tmp[1];
			 
			 for(int i=0;i<dirs.length;i=i+2) {
				 int dx =x+dirs[i];
				 int dy = y+dirs[i+1];
				 if(dx==target[0] && dy==target[1]) {
					 return 1;
				 }
				 if(dx>=0 && dx<r && dy>=0 && dy<r && !visited[dx][dy] && grid[dx][dy]==3 ) {
					 visited[dx][dy] = true;
					 q.add(new int[] {dx,dy});
				 }
			 }
			 
		 }
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t-->0) {
			 int r = sc.nextInt();
			 
			 int n = r*r;
			 
			 int[][] grid = new int[r][r];
			 Queue<int[]> q= new LinkedList<>();
			 int[] target = new int[2];
			 
			 
			 for(int i =0;i<r;i++) {
				 for(int j =0;j<r;j++) {
					 
					 int bc = sc.nextInt();
					 grid[i][j]= bc;
					 
					 if(bc==1) {
						 //add source;
						 q.add(new int[] {i,j});
					 }else if(bc==2) {
						 target[0]=i;
						 target[1]=j;
					 }
					 
				 }
			 }
			 
			System.out.println( pathexist(grid, target, r, q));
			 
		 }
	}

}
