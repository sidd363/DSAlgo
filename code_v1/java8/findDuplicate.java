package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findDuplicate {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(1,3,4,4,5,1,7, 4));
        findDuplicates(al);
    }

    private static void findDuplicates(List<Integer> al) {
        HashSet<Integer> hs = new HashSet<>();
       // al.stream().filter(x-> !hs.add(x) ).collect(Collectors.toSet()).forEach(System.out::println);
        //hs.stream().
        al.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().
                filter(entry-> entry.getValue()>1).forEach(x-> System.out.println(x.getKey()));
    }
}
