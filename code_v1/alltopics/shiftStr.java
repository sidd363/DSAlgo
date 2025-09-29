
public class shiftStr {
	
    public static String stringShift(String s, int[][] shift) {
        int pos [] = new int[2];
        for(int i =0;i<shift.length;i++) {
        	pos[shift[i][0]] += shift[i][1];
        }
       // System.out.println(" left "+ pos[0]+ " right "+ pos[1]);
        int delta = (pos[0]-pos[1])%s.length();
        if(delta ==0) {
        	return s;
        }
        if(delta <0) {
        	delta = s.length()- Math.abs(delta);
        }
        String first  = s.substring(0, delta);
        String sec  = s.substring(delta, s.length());
        
        return sec+first;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] shift = {{0,1},{1,2} };
		System.out.println(" shift string "+ stringShift("abc", shift));
	}

}
