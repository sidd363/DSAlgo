
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Stream;

public class dbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(20+1.34f+"A"+"B");
//		Stream.of(100,200,300,400,500)
//		.filter(e->e>300)
//		.peek(System.out::println)
//		.findFirst()
//		.orElse(null);
	  dbs o = new dbs();
	  o.start();
	}
	void start() {
		String s1 ="sleep";
		String s2 =fit(s1);
		System.out.print(s1+" "+s2);
	}
	String fit(String d) {
		d = d + "sss";
		System.out.println(d);
		return "st";
	}
		

}
