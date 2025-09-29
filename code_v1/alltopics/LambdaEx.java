

import java.util.ArrayList;
import java.util.List;

public class LambdaEx {
	String name;
	public LambdaEx(String name, int salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	int salary,age;
	

	public  int getSalary() {
		return salary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaEx d1 = new LambdaEx("siddhant", 90000, 27);
		LambdaEx d2 = new LambdaEx("arora", 60000, 26);
		LambdaEx d3 = new LambdaEx("nimish", 100000, 25);
		
		System.out.println("hello wprld");
		
		List l = new ArrayList();
		l.add(d1);
		l.add(d2);
		l.add(d3);
		
		
		
		l.sort( ( (n1, n2) -> ((LambdaEx) n2).getSalary() -  ((LambdaEx) n1).getSalary() ));
		
		
		l.forEach((deve)-> System.out.println(" deve "+deve));
		//sort list of developers on basis of salary

	}


	@Override
	public String toString() {
		return "LambdaEx [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

}
