
import java.util.Iterator;
import java.util.Stack;

public class NextBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123;
		// 1345  ---->.>   1 3 5 4 === 1534    1435      // 4>5 54   
		//1 2 3 = 1 3 2 //3 is greater then 
		//put number in stack and then check for any smaller number then need to swap them just
		int t = n;
		Stack<Integer> st = new Stack<Integer>();
		int prev = t%10;
		while (t>0) {
			int m  = t%10;
			if(m<prev) {
				
			}
			st.add(m);
			t =t /10;
		}
		
		Iterator<Integer> it = st.iterator();
		
		while(it.hasNext()) {
			int e = it.next();
			System.out.println("each ele "+it.next());
		}
				
	}

}
