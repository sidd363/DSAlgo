

import java.util.Comparator;
import java.util.PriorityQueue;

class KeyComparator implements Comparator<key>{
	
	
	@Override
	public int compare(key k1, key k2) {
		// TODO Auto-generated method stub
		
		if(k1.freq<k2.freq) {
			return 1;
		}else if(k1.freq>k2.freq) {
			return -1;
		}
		return 0;
	}
	
}



class key {
	char val;
	int freq;
	key(char v,int f){
		val = v;
		freq=f;
	}
	
	
}


public class RearrangeCharactersHeap {
	
	
	public static int canBeRearanged(String s) {
		int ans = 0;
		
		// prepare frequency of each char
		int [] fcm= new int[26];
		for(int i=0;i<s.length();i++) {
			fcm[s.charAt(i)-'a']++ ;
		}
		
		// prepare priority queue with these entries
		PriorityQueue<key> pq =  new PriorityQueue<>(new KeyComparator());
		
		
		for(char i = 'a';i<='z';i++) {
			// add  key to it
			if(fcm[i-'a']>0) {
				pq.add(new key(i, fcm[i-'a']));
			}
			// here entries are being added to pq and priority is decided on freq
		}
		
		
		
//		3. While pq is not empty.
//		….. Pop an element and add it to the result.
//
//		….. Decrease frequency of the popped element by ‘1’
//		….. Push the previous element back into the priority_queue if it’s frequency > ‘0’
//		….. Make the current element as the previous element for the next iteration.
//
//		4. If the length of the resultant string and original, print “not possible”. Else print result.
		String str="";
		key prev = new key('#', -1);
		while(!pq.isEmpty()) {
			key tmp = pq.poll();
			str += tmp.val; // adding to resultant string
			// decreasing freq
			tmp.freq--; 
			if(prev.freq >0) {
				pq.add(prev);
			}
			prev = tmp;
			
		}
		System.out.println(" res "+ str);
		
		if(s.length()==str.length()) {
			ans =1;
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		System.out.println(canBeRearanged(s));
	}

}
