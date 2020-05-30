
import java.util.Scanner;

public class specialMatrxiGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t-->0) {
			 int r = sc.nextInt();
			 int c = sc.nextInt();
			 int k = sc.nextInt();
			 
			 long [][] grid = new long[r][c];
			 
			 for(int i=0;i<k;i++)
			 {
				 
					 int br = sc.nextInt();
					 int bc = sc.nextInt();
					 
					 grid[br-1][bc-1] =  -1;
				
			 }
			 // iterate for every column
			 grid[0][0]=1;
			 boolean blockPresent = false;
			 for(int i =1;i<c;i++)
			 {
				if( blockPresent) {
					 grid[0][i] =  -1;
					 continue;
				}
				if(grid[0][i]==-1) {
					blockPresent = true;
				}else {
					grid[0][i]= 1;
				}
			 }
			 
			 
			 blockPresent = false;
			 for(int i =1;i<r;i++)
			 {
				if( blockPresent) {
					 grid[i][0] =  -1;
					 continue;
				}
				if(grid[i][0]==-1) {
					blockPresent = true;
				}else {
					grid[i][0]= 1;
				}
			 }
			 
			 
			 for(int i =1;i<r;i++)
			 {
				 for(int j =1;j<c;j++)
				 {
					 if(grid[i][j]==-1) {
						 continue;
					 }
					 if(grid[i][j-1]==-1 && grid[i-1][j]==-1) {
						 grid[i][j]=-1;
						 continue;
					 }
					 if(grid[i][j-1]==-1 || grid[i-1][j]==-1) {
						 grid[i][j]= Math.max(grid[i][j-1], grid[i-1][j]);
						 continue;
					 }else {
						 grid[i][j] =grid[i][j-1] + grid[i-1][j];
					 }
				 }
			 
			 }
			 
//			 for(int i =0;i<r;i++)
//			 {
//				 for(int j =0;j<c;j++)
//				 {
//					 System.out.print(grid[i][j]+"\t");
//				 }
//				 System.out.println();
//		    }
			 if(grid[r-1][c-1]==-1){
			     grid[r-1][c-1]=0;
			 }
			 System.out.println( grid[r-1][c-1] % 1000000007);
		 }
		

//		 int[][] grid = { {1,0,1},
//		   			{0,0,0},
//		   			{1,0,1}
//		   			};
////
//		 1 1
//		 -1 -1
//		-1  -1
//		 -1
//		 -1
//		 -1
//
//		 specialMatrxiGFG sb = new specialMatrxiGFG();
//        System.out.println(sb.myfun(grid));

	}

}
