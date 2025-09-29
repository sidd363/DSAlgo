package twoPointers;

public class subArrKdistinct {
	
    public static int subarraysWithKDistinct(int[] A, int K) {
        int res = 0;
        int i =0,j=0, count = 0, prefix =0;
        int [] copy = new int [A.length+1];
        
        for(i =0; i<A.length; i++) {
        	if(copy[A[i]]++==0) {
        		
        		count++;
        	}
        	if(count>K) {
        		prefix = 0;
        		copy[A[j]]--;
        		j++;
                count--;
        	}
        	while(copy[A[j]]>1) {
        		prefix++;
        		copy[A[j++]]--;
        	}
        	if(count==K) {
        		res = res +1+prefix;
        	}
        }
        
        
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" TOTAL SUBARRAYS ARE "+subarraysWithKDistinct(new int[]{1,2,1,2,3}, 2));
	}

}
