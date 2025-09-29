

import java.util.PriorityQueue;

public class kthlargestLeet {
	 public static  Integer topKFrequent(int[] nums, int k) {
		 
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
		      
	      
	       
	       //build a priority queue
	       //min priority queue
	       
	        
	       for(int i :nums) {
	    	   pq.add(i);
	    	   if(pq.size()>k) {
	    		   pq.poll();
	    	   }
	       }
	       
	       
	      
	        return pq.poll();
	        
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a[] = {1,1,1,2,2,2,2,3,3, 4,4,4,4 ,7,7,9};
		
		int k =3;
		int l =topKFrequent(a, k);
		System.out.println("output k th  largest "+l);

	}

}
