
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MakeBiggestNumberfromarrayofnum { 
	private void findbigger(List<String> a) {
		
		Collections.sort(a, new Comparator<String>() {
			
				public int compare(String x, String y) {
					String xy = x+y;
					String yx = y+x;
					return xy.compareTo(yx) > 0 ? -1 :1 ;
				}
			
		});
		
		for(String i : a) {
			System.out.println(" each ele is "+ i);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
	 List<String> a = new ArrayList<String>();
	 a.add("9");
	 a.add("39");
	 a.add("33");
	 a.add("5");
	 a.add("4");
	 
	 MakeBiggestNumberfromarrayofnum nb = new MakeBiggestNumberfromarrayofnum();
	 nb.findbigger(a);
	 

	}

}
