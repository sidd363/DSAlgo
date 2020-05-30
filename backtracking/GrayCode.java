package backtracking;
import java.util.*;
public class GrayCode {
	
    public List<Integer> grayCode(int n) {
    	List<Integer> ans = new ArrayList<Integer>();
    	
    	//00 01 11 10
    	//000 001 011 010 111 110 100 101 
    	
//    	00
//    	01
//   ------------
//    	11
//    	10 add 1 at left end to last size //suppose n =2 then we can make it via n=1 by adding 1 only
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrayCode gc = new GrayCode();
		System.out.println(gc.grayCode(2));

	}

}
