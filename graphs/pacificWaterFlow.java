package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pacificWaterFlow {
    public static List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>>  ans = new ArrayList<List<Integer>>();
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                boolean l = false, r = false, u = false ,d = false;
                //            i-1, j &&  i+1,j
                // i, j-1----  i,j  --- i, j+1
                if(i-1>=0 && i-1 <matrix.length && matrix[i-1][j] <= matrix[i][j]){
                    u = true;
                }
                if(i+1>=0 && i+1 <matrix.length && matrix[i+1][j] <= matrix[i][j]){
                    d = true;
                }
                if(j-1>=0 && j-1 <matrix[0].length && matrix[i][j-1] <= matrix[i][j]){
                    l = true;
                }
                if(j+1>=0 && j+1 <matrix[0].length && matrix[i][j+1] <= matrix[i][j]){
                    r = true;
                }

                if(l|| r|| u||d){
                    ans.add(new ArrayList<Integer>(Arrays.asList(i,j)) );
                }

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}};
        System.out.println(pacificAtlantic(grid));
    }
}

