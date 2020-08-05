package alltopics;

import java.util.*;

public class sortdouble {
    public static List<String> my(List<String> al ){
        Collections.sort(al);
        return al;
    }
    public static void main(String[] args) {
        List<String> al = new ArrayList<>(Arrays.asList("33.7", "21.9", "11.7", "22", "30"));
        List<String> al2 = new ArrayList<>(Arrays.asList("5", "23", "33"));

        System.out.println(my(al2));
    }
}
