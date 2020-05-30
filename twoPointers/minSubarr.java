package twoPointers;
import java.util.*;
public class minSubarr {
	
	public static void minsubarr(int [] a, int k ) {
		List<Integer> al = new ArrayList();
		int min = Integer.MAX_VALUE;
		int right = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer> ();
		for( right =0;right<k;right++) {
			pq.add(a[right]);
		}
		
		al.add(pq.peek());
		
		
		
		
		for( right = k;right<a.length;right++) {
			// 1 2 3 4 >>> 4>1
			// 2 3 4
			int left = right -k;
			pq.remove(a[left]);
			pq.add(a[right]);
			al.add(pq.peek());
		}
		System.out.println(" array list -- "+ al);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //arr[] = {5, 3, 4, 1, 1}, K = 3
		minsubarr(new int[] {1, 1, 0, 1, 1}, 3);
	}

}
