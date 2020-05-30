package backtracking;

import java.util.*;

public class seqDigits {
	
    public static List<Integer> sequentialDigits(int low, int high) {
    	List<Integer> ans = new ArrayList<Integer>();
    	String number = "0";
    	bt(ans, low, high, number);
    	
    	return ans;
    }

	private static void bt(List<Integer> ans, int low, int high, String number) {
		// TODO Auto-generated method stub
		System.out.println(" number "+ number );
		int noInt = Integer.valueOf(number);
		if(noInt > high) {
			//return;
		}
		if(noInt >= low) {
			System.out.println(" number2  "+ number);
			ans.add(Integer.valueOf(number));
		}
		//ans.add(Integer.valueOf(number));	
		for(int i = 1; i<10; i++) {
			String tmp = number;
			number+=i;
			
			int l = number.length();
			if(l>=2 && (Integer.valueOf(number.charAt(l-1)+"") - Integer.valueOf(number.charAt(l-2)+"")!=1)) {
				System.out.println(number.charAt(l-1) + " "+ number.charAt(l-2));
				number = tmp;
				continue;
			}
			System.out.println(" number3  "+ number + " tmp berg "+ tmp);
			bt(ans, low, high, number);
			
			number = tmp;
			System.out.println(" number4  "+ number + " tmp"+ tmp);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sequentialDigits(100, 300));
	}

}
