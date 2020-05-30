

public class kswaptogetMaxContiguous1leet1004 {

    public static int longestOnes(int[] A, int K) {
    	if(A.length==0) {
    		return 0;
    	}
    	
    	int totalOne = 0;
    	
    	for(int i:A) {
    		totalOne+=i;
    	}
    	//prepare window of size equals to totalone and choose that window that has max one
    	int l =0;
    	int r = 0;
    	int oneInEachWindow = 0;
    	int maxOne = 0;
    	int zeroc=0;
    	System.out.println("totalOne "+totalOne);
    	System.out.println("len of array "+A.length);
    	while(r<A.length) {
    		if(r<totalOne) {
    			oneInEachWindow+=A[r++];
    			maxOne = oneInEachWindow;
    			System.out.println("oneInEachWindow in first"+oneInEachWindow);
    			System.out.println("------------");
    			zeroc = totalOne-oneInEachWindow;
    		}else {
    			if(A[l]==1) {
    				oneInEachWindow--;
    			}
    			l++;
    			if(A[r]==1) {
    				oneInEachWindow++;
    			}
    			r++;
    			System.out.println("oneInEachWindow "+oneInEachWindow);
    			System.out.println("------------");
    			//compare one each window with max one and update it
    			maxOne = Math.max(maxOne, oneInEachWindow);
    			zeroc = totalOne-maxOne;
    		}
    	}
    	int ans =0;
    	if(zeroc >= K) {
    		ans = K+maxOne;
    	}else {
    		
    	}
    	return maxOne+K>A.length ?A.length:maxOne+K ;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,0,0,0,1,1,0,0,1,1,0,0,0,0,0,0,1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,0,1,0,0,1,1,0,1,1};
		
		int k =8;
		System.out.println(longestOnes(a, k));
	}

}
