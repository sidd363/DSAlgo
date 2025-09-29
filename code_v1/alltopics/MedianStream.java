

import java.util.*;

public class MedianStream {
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 PriorityQueue<Integer> mpq =  new PriorityQueue<Integer>(Collections.reverseOrder());
		 PriorityQueue<Integer> pq =  new PriorityQueue<Integer>();
		 
		 while(t-->0) {
			 int el = sc.nextInt();
			 // add to mpq
			 mpq.add(el);
			 int maxNo = mpq.poll();
			 pq.add(maxNo);
			 if(mpq.size() < pq.size()) {
				 mpq.add(pq.poll());
			 }
			 // if no of ele even then peek of both divided by 2 will be median else max pq peek will be median
			 if(mpq.size() == pq.size()) {
				 //even case
				 System.out.println((mpq.peek()+pq.peek())/2);
			 }else {
				 System.out.println(mpq.peek());
			 }
		 
		 }
	}

}
