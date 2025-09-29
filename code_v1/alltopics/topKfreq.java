
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class topKfreq {
	 public static  List<Integer> topKFrequent(int[] nums, int k) {
	        HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
	        
	        
	        //step 1 initialize a hashmap
	       for(int i:nums) {
	    	   if(hm.containsKey(i)) {
	    		   hm.put(i, hm.get(i) +1);
	    	   }else {
	    		   hm.put(i,1);
	    	   }
	       }
	       
	       //build a priority queue
	       //min priority queue
	       
	       PriorityQueue<Integer> pq = new PriorityQueue<Integer>((n1,n2)-> hm.get(n1)-hm.get(n2)); 
	       
	       for(int i :hm.keySet()) {
	    	   pq.add(i);
	    	   if(pq.size()>k) {
	    		   pq.poll();
	    	   }
	       }
	       System.out.println("pq "+hm.size());
	       
	       List<Integer> l = new ArrayList<Integer>();
	       
	       
	       while(pq.size()>0) {
	    	   l.add(pq.poll());
	       }
	       
	        
	        Collections.reverse(l);
	        return l;
	        
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,1,2,2,2,2,3,3, 4,4,4,4 ,7,7,9,};
		
		int k =6;
		List<Integer> l =topKFrequent(a, k);
		System.out.println("output"+l);
		l.forEach((i)-> System.out.println(" top k are "+i));
		
		
		
		
	}

}
