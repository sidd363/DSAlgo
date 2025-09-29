package backtracking;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
    public  static String getPermutation(int n, int k) {
        String ans = "";
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1;i<n;i++){
            fact = fact * i;
            //1 * 2* 3 = 6
            numbers.add(i);
        }
        numbers.add(n);
        k = k-1;
        while(true){
            ans = ans + numbers.get(k/fact);

            // 16/6 = 2 1 2 3
            numbers.remove(k/fact); // 16%6 = 4
            if(numbers.size()== 0){
                break;
            }
            k = k%fact; // 4
            fact = fact /numbers.size();
           // fact = numbers

        }


        return ans;

    }
    public static void main(String[] args) {
        System.out.println(" kth permutation is :" + getPermutation(4, 17));
    }
}
