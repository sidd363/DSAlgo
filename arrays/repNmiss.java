package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class repNmiss {
    public static ArrayList<Integer> repeatedNumber(final ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int cs;
        int as = 0;
        int ap = 0;
        int d = 0;
        int m = 0;


        cs = arr.stream().mapToInt(x-> x).sum();


        List<Integer> range = IntStream.rangeClosed(1, arr.size())
                .boxed().collect(Collectors.toList());

        as = range.stream().mapToInt(x->x).sum();

        ap = range.stream().reduce(1, (x,y)-> x*y);

        int cp = arr.stream().reduce(1, (x, y)-> x*y);


        d = ((as-cs)*cp )/ (ap-cp);
        m = d+ as-cs;



        ans.add(d);
        ans.add(m);
        return  ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans = repeatedNumber(new ArrayList<Integer>(Arrays.asList(1,5,4,1,3)));
        ans.stream().forEach(System.out::println);
    }
}
