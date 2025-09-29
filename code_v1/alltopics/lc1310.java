
public class lc1310 {
	 public static int[] xorQueries(int[] arr, int[][] queries) {
	        int[] ans= new int[queries.length];
	        /*
	        for(int i=0;i<queries.length;i++) {
	        	int [] tq = queries[i];
	        	int f = tq[0], s=tq[1];
	        	int tans = 0;
	        	for(int j=f;j<=s;j++) {
	        		tans ^= arr[j];
	        	}
	        	ans[i]= tans;
	        }*/
	        
	        int []prefix = new int[arr.length];
	        if(arr.length<1) {
	        	return ans;
	        }
	        prefix[0]= arr[0];
	        for(int i =1;i<arr.length;i++) {
	        	prefix[i]= prefix[i-1]^arr[i];
	        }
	        
	        for(int i=0;i<queries.length;i++) {
	        	int [] tq = queries[i];
	        	int f = tq[0], s=tq[1];
	        	int tans = 0;
	        	
	        	tans = f== 0? prefix[s]: (prefix[s]^prefix[f-1]) ;
	        	ans[i]= tans;
	        }
	        
	        // this is based on the fact that xor bw l to r is 0 to r 
	        //XOR with 0 to l-1;
	        
	        
	        
	        return ans;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
//				Output: [2,7,14,8] 
		int [] arr = {1,3,4,8};
		int [][] queries =  {{0,1},{1,2},{0,3},{3,3}};
		int [] ans = xorQueries(arr, queries);
		for(int i =0;i<ans.length;i++) {
			System.out.print(ans[i]+ "\t");
		}
		
	}

}
