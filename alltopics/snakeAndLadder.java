
import java.util.*;

public class snakeAndLadder {
	
	public int snakesAndLadders(int[][] grid) {
	        //int ans =0;
	        
	        int r = grid.length;
	        int c = grid[0].length;
	        
	        Queue<int[]> q = new LinkedList<>();
	        
	        boolean[]visited = new boolean[r*c];
	        
	        // 0 -> dist, 1-> dist, 2-> dist
	        q.add(new int[] {0,0});
	        
	        int [] board = new int[r*c];
	        
	        int k=0;
	        
	        boolean right = true;
	        
	        for(int i =r-1;i>=0;i--) {
	        	if(right) {
		        	for(int j=0;j<c;j++) {
		        		board[k++]= grid[i][j];
		        	}
		        	right = false;
	        	}else {
	        		for(int j=c-1;j>=0;j--) {
		        		board[k++]= grid[i][j];
		        	}
	        		right = true;
	        	}
	        }
	        
//	        for(int i=0;i<r*r;i++) {
//	        	System.out.print(board[i]+"\t");
//	        }
//	        System.out.println();
	        // board is now filled that is 1 d array now then perform bfs over that
	        
	      
	        
	       
	        while(!q.isEmpty()) {
	        	int [] tmp = q.poll();
	        	int vertex = tmp[0];
	        	int distance = tmp[1];
	        	
	        	
	        	if(vertex == r*r-1 ) {
	        		return distance;
	        	}
	        	
	        	
	        	for(int i = vertex+1; i<vertex+7 && i<r*r;i++) {
	        		
	        		if(!visited[i]) {
	        			int disttmp = distance+1;
		        		int vtmp = i;
		        		visited[i] = true;
		        		
		        		if(board[vtmp]!= -1) {
		        			vtmp = board[vtmp]-1;
		        		}
		        			
		        		q.add(new int[] {vtmp,disttmp});
		        		
	        		}
	        		
	        	}
	        }
	        
	        
	        
	        
	        return -1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		int[][] grid = 	{
//		{-1,-1,-1,-1,-1,-1},
//		{-1,-1,-1,-1,-1,-1},
//		{-1,-1,-1,-1,-1,-1},
//		{-1,35,-1,-1,13,-1},
//		{-1,-1,-1,-1,-1,-1},
//		{-1,15,-1,-1,-1,-1}};
		int[][] grid = 	{{51,-1,-1,63,-1,31,21,-1},
		{-1,-1,26,-1,-1,38,-1,-1},
		{-1,-1,11,-1,14,23,56,57},
		{11,-1,-1,-1,49,36,-1,48},
		{-1,-1,-1,33,56,-1,57,21},
		{-1,-1,-1,-1,-1,-1,2,-1},
		{-1,-1,-1,8,3,-1,6,56}};
//		
//		int[][] grid = 	{
//				{-1,-1,-1},
//				{-1,-1,-1},{-1,9,-1}};



		snakeAndLadder sb = new snakeAndLadder();
        System.out.println(sb.snakesAndLadders(grid));
	}

}
