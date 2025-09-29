package graphs;

public class shortPathBinMat {
    static  int ans =0;
    public static int findShortestPath(boolean[][] mat,
                                       int sourceX, int sourceY,
                                       int destX, int destY,
                                       int n, int m) {
        // Write your code here.
        ans = Integer.MAX_VALUE;
        boolean[][] vis = new boolean[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (!vis[i][j]) {
//                    dfsUtilMin(mat, sourceX, sourceY, destX, destY, n, m, vis);
//                }
//            }
//
//        }
        dfsUtilMin(mat, sourceX, sourceY, destX, destY, n, m, vis, 1);

        return  ans != Integer.MAX_VALUE ? ans : -1;
    }

    private static void dfsUtilMin(boolean[][] mat, int sx, int sy, int dx, int dy, int n, int m, boolean[][] vis, int count) {
        if(sx<0 || sy >= m || sx >=n || sy<0 || vis[sx][sy] == true || mat[sx][sy]!= true ){
            return;
        }
        vis[sx][sy] = true;
        if(sx == dx && sy == dy){
            ans = Math.min(ans, count);
            return;
        }

        dfsUtilMin(mat, sx+1, sy, dx, dy, n, m, vis, count+1);
        dfsUtilMin(mat, sx-1, sy, dx, dy, n, m, vis, count+1);

        dfsUtilMin(mat, sx, sy+1, dx, dy, n, m, vis, count+1);

        dfsUtilMin(mat, sx, sy-1, dx, dy, n, m, vis, count+1);




    }

    public static void main(String[] args) {
        boolean[][] grid = {{true, false, true},
                {true, true, true},{true, true, true}};
//                {0, 0, 0, 1},
//                {1, 0, 0, 0}};

        System.out.println(" max matched --> "+ findShortestPath(grid, 0, 0, 0, 2, 3, 3));
    }
}
