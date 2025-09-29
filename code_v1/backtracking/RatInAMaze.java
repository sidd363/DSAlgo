package backtracking;

import java.util.ArrayList;

public class RatInAMaze {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] vis = new boolean[n][n];
        util(m, n, vis, "", ans, 0, 0);
//        if(ans.size() ==0){
//            return -1;
//        }
        return ans;
    }

    private static void util(int[][] grid, int n, boolean[][] vis, String s, ArrayList<String> ans, int i, int j) {
        if(i<0 || j<0 || i>=n || j>=n || grid[i][j]==0 || vis[i][j]== true){
            return;
        }
        if(i==n-1 && j == n-1){
            ans.add(s);
        }
        vis[i][j]  = true;
        // DLRU
        util(grid, n, vis, s+"D", ans, i+1, j);
        util(grid, n, vis, s+"L", ans, i, j-1 );
        util(grid, n, vis, s+"R", ans, i, j+1);
        util(grid, n, vis, s+"U", ans, i-1, j);

        vis[i][j]  = false;


    }

    public static void main(String[] args) {
        int m[][] = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}};
        int n = 4;
        ArrayList<String> paths = findPath(m, n);
        for(String path : paths){
            System.out.println("path is : "+path);

        }
    }
}
