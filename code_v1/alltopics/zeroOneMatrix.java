
import java.util.LinkedList;
import java.util.Queue;

public class zeroOneMatrix {
	
	
	public int[][] myfun(int[][] grid) {
		
		int [][] dist;
		int r = grid.length;
		if(r==0 ||  grid[0]==null) {
			return null;
		}
    	int c = grid[0].length;
    	dist = new int[r][c];
    	// find all sources
    	Queue<int[]>q = new LinkedList<int[]>();
    	
    	for(int i =0;i<r;i++) {
    		for(int j = 0;j<c;j++) {
    			if(grid[i][j]==0) {
    				dist[i][j]=0;
    				q.offer(new int[] {i,j});
    			}else {
    				dist[i][j]=Integer.MAX_VALUE;
    			}
    		}
    	}
    	//System.out.println(" q . size"+ q.size());
    	
    	
    	int[][] dirs = {{-1,0},{0,-1},{1,0},{0,1}};
    	
    	while(!q.isEmpty()) {
			int [] tmp = q.poll();
			int x = tmp[0];
			int y = tmp[1];
			
			for(int[] dir: dirs) {
				int dx = x+ dir[0];
				int dy = y+ dir[1];
				
				if(dx <0 || dx>=r || dy<0 || dy>=c || grid[dx][dy]==0) {
					continue;
				}else {
					if(dist[dx][dy]> dist[x][y]+1) {
						dist[dx][dy] =  dist[x][y]+1;
						q.offer(new int[] {dx,dy});
					}else {
						continue;
					}
				}
				
			}
    			
    			
    		
    		
    	}       
    	
		return dist;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[][] grid = { {0,0,0},
		   			{0,1,0},
		   			{1,1,1}
		   			};


		 zeroOneMatrix sb = new zeroOneMatrix();
		 
        int[][]dist = sb.myfun(grid);
         int r = dist.length;
         int c = dist[0].length;
	    	for(int i =0;i<r;i++) {
	    		for(int j = 0;j<c;j++) {
	    			System.out.print(dist[i][j]+"\t");
	    		}
	    		System.out.println();
	    	}
        // System.out.println(sb.myfun(grid));

	}

}
