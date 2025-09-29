package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MonkAndInversions {
    // Write your code here
    public static void main(String args[] ) throws Exception {

//        3
//        1 2 3
//        4 5 6
//        7 8 9
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.valueOf(br.readLine());                // Reading input from STDIN
        while (testcases > 0) {

            int n =   Integer.valueOf(br.readLine());                // Reading input from STDIN
            int nr = n;
            int [][] matrix = new int [n][n];
            int row = 0;
            while (nr > 0) {
                String second = br.readLine();
                String[] secArr = second.split(" ");
                int i = 0;
                for (String ele : secArr) {
                    matrix[row][i++] = Integer.valueOf(ele);
                }
                row++;
                nr--;
            }

            inversions(matrix, n);

            testcases--;
        }
    }

    private static void inversions(int[][] matrix, int n) {
        int ans = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                int ele = matrix[i][j];
                for(int k = i;k<n;k++){
                    for(int l = j;l<n;l++){
                        if(ele > matrix[k][l]){
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
