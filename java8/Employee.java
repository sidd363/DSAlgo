package java8;

public class Employee {
    String name;
    int age;

    public Employee(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public int hashCode() {
        return this.name.hashCode() % 31;
    }*/

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;


        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        Employee empObj = (Employee)obj;
        if(this.name.equals(empObj.getName())){
            return true;
        }
        return false;
    }
}
