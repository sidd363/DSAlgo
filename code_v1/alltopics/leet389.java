
public class leet389 {
	
	public static char findTheDifference(String s, String t) {
	        char ans = 0 ;
	        int  sum=0;
	        int i =0;
	        if(t.length()==0) {
	        	return ans;
	        }
	        for( i =0;i<s.length();i++) {
	        	sum = sum ^ s.charAt(i)^t.charAt(i);
	        }
	        sum = sum^t.charAt(i);;
	        ans = (char) sum;
	        return ans;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		String t = "";
		System.out.println(findTheDifference(s,t));
	}

}
