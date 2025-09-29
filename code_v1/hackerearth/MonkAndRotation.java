package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MonkAndRotation {

    public static void main(String args[] ) throws Exception {

        // Write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  testcases = Integer.valueOf(br.readLine());                // Reading input from STDIN
        while(testcases > 0){
            String first = br.readLine();
            String [] firstArr = first.split(" ");
            int n = Integer.valueOf(firstArr[0]);
            int k = Integer.valueOf(firstArr[1]);

            String second = br.readLine();
            List<Integer> arr = new ArrayList<>();
            String [] secArr = second.split(" ");
            for(String ele : secArr){
                arr.add(Integer.valueOf(ele));
            }
            rotateByK(arr, n, k%n);

            testcases--;
        }

    }

    private static void rotateByK(List<Integer> arr, int n, int k) {
        for(int i = n-k ; i< n; i++){
            System.out.print(arr.get(i));
            System.out.print(" ");
        }

        for(int i = 0; i< k;i++){
            System.out.print(arr.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}
