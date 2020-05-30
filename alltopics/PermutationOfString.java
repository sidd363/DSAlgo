
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class PermutationOfString {
	public static void permute(String c, int  l , int r, HashSet<String> hs ) {
		if(l>=r) {
			System.out.println(" stringn  is " + c);
			return;
		}
		else {
			
			//for(int i =l;i<=r;i++) {
				
				if (Character.isLetter(c.charAt(l))) {
					char da [] = c.toCharArray();
					
					da[l] = Character.toUpperCase(da[l]);
					
					c = String.valueOf(da);
					
				}
				
				//System.out.println(" string  is "+ c);
				
				hs.add(c);
				
				permute(c, l+1,r, hs);
				
				
				if (Character.isLetter(c.charAt(l))) {	
					char da [] = c.toCharArray();
					da[l] = Character.toLowerCase(da[l]);
					c =   String.valueOf(da);
				}
				hs.add(c);
			//}
		}		
	}
		//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//letter case permutation
		String s = "Jw";
		
		HashSet<String> hs = new HashSet<>();
		hs.add(s);
		permute(s, 0,s.length(), hs );
		Iterator<String> it  = hs.iterator();
		ArrayList<String> a = new ArrayList<>();
		while(it.hasNext()) {
			a.add(it.next());
		}
	    System.out.println(" hash set is "+ hs);
	}

}
