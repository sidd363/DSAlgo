package bitManipulation;

import java.util.Arrays;

public class reduceToOne {
	
	
	public static int numSteps(String s) {
        int step=0;
       // System.out.println(" no is "+s);
        if(s.length()==1 && s.equals("0")) {
        	return 1;
        }
       while(!s.equals("1")){
        	char [] ch = s.toCharArray();
        	char last = ch[ch.length-1];
        	//System.out.println(" last "+ last);
        	if(last=='1') {
        		// odd case then add 1
        		ch[ch.length-1]= '0';
        		int i = 0;
        		for( i = ch.length-2;i>=0;i--) {
        		    if(ch[i]=='0') {
        		    	ch[i]= '1';
        		    	
        		    	break;
        		    }else {
        		    	ch[i]='0';
        		    }
        		}
        		s = new String(ch);
        		if(i==-1) {
        			s = "1"+ s;
        		}
        	}else {
        		// even case
        		// by 2 
        		
        		s = new String(Arrays.copyOf(ch, ch.length-1));
        		//System.out.println( " new "+ s);
        	}
        	
            step++;
        }
      
        return step;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(" total steps -- "+ numSteps("0"));
       System.out.println(" total steps -- "+ numSteps("1111110011101010110011100100101110010100101110111010111110110010"));
	}

}
