package arrays;

public class Constructor {
    static String str;
    public void Constructor(){
        System.out.println(" in cons");
        str = "Hello world";
    }

    public static void main(String[] args) {
        Constructor  c = new Constructor();
        c.Constructor();
        System.out.println(str);
    }
}
