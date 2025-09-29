package matrix;

import java.util.ArrayList;
import java.util.List;

public class spiralTraversal {
    public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        int  top=0, right = c-1, left = 0, bottom= r-1;
        ArrayList<Integer> al = new ArrayList<>();
        while(top<=bottom && left<=right){

            for(int k = top;k<=right;k++){
               // System.out.println( matrix[top][k] +" 1st");
                al.add(matrix[top][k]);
            }
            top++;
            if(top<=bottom && left<=right ) {
                for (int k = top; k <= bottom; k++) {
                  // System.out.println(" 2nd " + matrix[k][right] + " ");
                    al.add(matrix[k][right]);
                }

            }
            right--;

            if(left<=right && top<=bottom) {
                for (int k = right; k >= left; k--) {
                    //System.out.println(" 3rd " + matrix[bottom][k] + " ");
                    al.add(matrix[bottom][k]);
                }

            }
            bottom--;

            if(top<=bottom && left<=right ) {
                for (int k = bottom; k >= top; k--) {
                   // System.out.println( " 4th "+ matrix[k][left]+" ");
                    al.add(matrix[k][left]);
                }
            }
            left++;
        }
        return al;
    }


    public static List<Integer> spiralOrder(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int left = 0, right = c-1;
        int top = 0, down = r-1;


        List<Integer> ans = new ArrayList<>();

        while(left<= right && top<=down){
            for(int k = left;k<=right; k++){
                ans.add(grid[top][k]);

            }
            top++;
            for(int k = top;k<=down; k++){
                ans.add(grid[k][right]);

            }
            right--;

            if(left<=right  ){
                for(int k = right;k>= left; k--){
                    ans.add(grid[down][k]);

                }
                down--;
            }


            if(top<=down
            ){
                for(int k = down;k>= top; k--){
                    ans.add(grid[k][left]);

                }
                left++;
            }

        }
        return ans;
    }
    public static void main(String[] args) {

        int [][] matrix = {{1, 2, 3 },{4, 5, 6 }, {7, 8, 9 }};
       // int [][] mat = {{5, 1},
         //       {5, 6, 7}};
        //System.out.println(spirallyTraverse(matrix, 3, 5));
        List<Integer> ans = spiralOrder(matrix);
        for(int i : ans)
        System.out.print(i +"\t");
        System.out.println();
    }
}
