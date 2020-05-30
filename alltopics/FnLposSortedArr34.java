
public class FnLposSortedArr34 {
	
	
	    public static int[] searchRange(int[] a, int target) {
	        int []ans= new int [2];
	        ans[0]=-1;
	        ans[1]=-1;
	        int h = a.length;
	        int l = 0;
	        int mid =0;
	        
	        
	        while(l<h){
	            mid = l+ (h-l)/2;
	            int ele = a[mid];
	            
	            if(ele == target){
	                //if it is only one
	                break;
	            }else if(ele<target){
	                l= mid+1;
	            }else{
	                h=mid;
	            }
	        }
	        
	        
	        if(a[mid]!=target) {
	        	return ans;
	        }
	        
	        int tm = mid;
	        
	        
            while( mid < a.length && a[mid]== target){
           	// System.out.println("sec matched"+ mid);
                ans[1] =mid;
                mid++;
            }
            
            while(tm >=0 && a[tm]== target) {
           	 ans[0]= tm;
           	 tm--;
            }
            
          
           return ans;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {7};
       int k = 7;
       int ans []=searchRange(a, k);
       
       for(int i: ans) {
    	   System.out.println(" ans is "+i);
       }
	}

}
