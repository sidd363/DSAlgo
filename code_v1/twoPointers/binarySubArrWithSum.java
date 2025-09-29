package twoPointers;

public class binarySubArrWithSum {
	
    public static int numSubarraysWithSum(int[] a, int k) {
//        int res = 0, j =0, prefix = 0;
//        int [] m = new int[2];
//        
//        for(int elem:a) {
//        	   m[elem]++;
//        	   if(m[1]>k) {
//        		   m[1]--;
//        		   prefix =0;
//        		   j++;
//        	   }
//        	   while(m[0]>=1 &&a[j]==0) {
//        		   j++;
//        		   prefix++;
//        		   m[0]--;
//        	   }
//        	   
//        	   if(m[1]==k) {
//        		   res = res+1+prefix;
//        	   }
//        }
//        return res;
    	  return atMost(a, k) - atMost(a, k - 1);
    }

    public static int atMost(int[] A, int S) {
        if (S < 0) return 0;
        int res = 0, i = 0, n = A.length;
        for (int j = 0; j < n; j++) {
            S -= A[j];
            while (S < 0)
                S += A[i++];
            res += j - i + 1;
        }
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" total number of subarrays "+numSubarraysWithSum(new int[] {1, 0 , 1, 0, 1}, 2));
	}

}
