package heaps;

import java.util.ArrayList;
import java.util.Arrays;

//You are given K sorted integer arrays in a form of 2D integer matrix A of size K X N.
//
//        You need to merge them into a single array and return it.

/*Example Input
        Input 1:

        A = [  [1, 2, 3]
        [2, 4, 6]
        [0, 9, 10]
        ]


        Example Output
        Output 1:

        [0, 1, 2, 2, 3, 4, 6, 9, 10]*/
public class mergeKsortedArr {
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> ans = new ArrayList<>();

       // PriorityQueue<PairSum> pq = new PriorityQueue<PairSum>();
        
        return  ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ar1 = new ArrayList<>(Arrays.asList(1, 2, 3));

        ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(2, 4, 6));

        ArrayList<Integer> ar3 = new ArrayList<>(Arrays.asList(0, 9, 10));

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(ar1);
        a.add(ar2);
        a.add(ar3);

        System.out.println(solve(a));

    }
}
