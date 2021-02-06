package matrix;

import java.util.ArrayList;

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
    public static void main(String[] args) {

        int [][] matrix = {{6, 6, 2, 28, 2 },
                {12, 26, 3 ,28, 7},
                {22 ,25 ,3 ,4, 23}};
       // int [][] mat = {{5, 11, 30},
         //       {5, 6, 7}};
        System.out.println(spirallyTraverse(matrix, 3, 5));
    }
}
