import java.util.Stack;

public class lc14May {
	
    public static String removeKdigits(String num, int k) {
        
        int l = num.length();
        if(l==k) {
        	return "0";
        }
        
        Stack<Character> st = new Stack<Character>();
        
        //building stack from numbers
        int i = 0;
        while(i<l) {
        	while( k>0 && st.size()>0 && st.peek() > num.charAt(i)) {
        		k--;
        		st.pop();
        	}
        	st.push(num.charAt(i));
        	i++;
        }
        
        //when all numbers are equal
        
        while(k>0 && st.size()>0) {
        	k--;
        	st.pop();
        }
        
        //build stringbuilder
        StringBuilder sb = new StringBuilder();
        while(st.size()>0) {
        	sb.append(st.pop());
        }
        sb.reverse();
        
        // remove 0 from front;
        
        while(sb.length()>0 && sb.charAt(0)=='0') {
        	sb.deleteCharAt(0);
        }
        
        
        return sb.toString();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" remove k digits number "+ removeKdigits("10", 3));
	}

}
