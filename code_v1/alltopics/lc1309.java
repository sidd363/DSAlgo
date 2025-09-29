import java.util.*;

public class lc1309 {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder("");
        HashMap<String,String> hm = new HashMap<String,String>(); 
        for(int i=1;i<27;i++) {
        	hm.put(String.valueOf(i),String.valueOf((char)('a'+(i-1))));
        }
        
        char[] ca = s.toCharArray();
        for(int i=0;i<ca.length;) {
        	if(i+2<ca.length && ca[i+2]=='#') {
        		String tmp =""+ca[i]+ca[i+1]+"";
        		sb.append(hm.get(tmp));
        		i=i+3;
        	}else {
        		String tmp = String.valueOf((ca[i]));
        		//System.out.println(" tmp in else "+ tmp);
        		sb.append(hm.get(tmp));
        		i++;
        	}
        }
        //System.out.println(hm);
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
	}

}
