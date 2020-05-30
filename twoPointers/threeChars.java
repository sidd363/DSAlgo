package twoPointers;

public class threeChars {
	//Given a string s consisting only of characters a, b and c.

	// Return the number of substrings containing at least one occurrence of all these characters a, b and c.


    public static int numberOfSubstrings(String s) {
        int ans =0;
        int [] count = new int[3];
        int j =0;
        for(int i=0;i<s.length();i++) {
        	   count[s.charAt(i)-'a']++;
        	   while(count[0]>0 && count[1]>0 && count[2]>0) {
        		   count[s.charAt(j)-'a']--;
        		   j++;
        	   }
        	   ans+=j;
        }
        
        
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(" number of sub strings "+ numberOfSubstrings("aaabc"));
	}

}
