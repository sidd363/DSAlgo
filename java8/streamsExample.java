package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamsExample {
    public void recur(){
        List<Integer> list = new ArrayList<>();
        while(true){
            list.add(1);
        }
    }
    public static void main(String[] args) {
        List<String> months= Arrays.asList("jan", "feb", "marc", "april", "may", "june", "july", "aug", "sept", "oct", "nov", "dec");
        streamsExample se = new streamsExample();
        se.recur();
        System.out.println(months.stream().count() + months.stream().count() );
    }
}
