package java8;

public class HashMapExercise {

    public static void main(String args[]) {
       /* Employee emp1 = new Employee("One",1);
        Employee emp2 = new Employee("One",1);

        HashMap<Employee, String> hm = new HashMap<Employee, String>();

        hm.put(emp1, "ram");
        hm.put(emp2, "shyam");
        hm.put(emp2, "swap");

        //System.out.println("Both Objects are Equal: "+emp1.equals(emp2));
        System.out.println("Size: "+hm.size());
        System.out.println("Employee 1 Hashcode: "+emp1.hashCode());
        System.out.println("Employee 2 Hashcode: "+emp2.hashCode());
        System.out.println("getting hm vslues  "+ hm.get(emp1));
        System.out.println("getting hm vslues  "+ hm.get(emp2));*/

        // hm.forEach((k, v) -> System.out.println("Key is: " + k + " Value is: " + v));

       // System.out.println(checkException());


        ConcreteA a = new ConcreteA();
        concreteB b = new concreteB();
        a.x = 0;
        b.x = 0;

        a.cal(2);
        b.cal(2);
        System.out.println(a.x + " --- "+ b.x);
    }

    public static  Object checkException()
    {
        try{
            int i = 10/0;
            return "try";
        }catch (ArithmeticException e){
            return "catch";
        }finally {
            return "finally";
        }
    }
}
