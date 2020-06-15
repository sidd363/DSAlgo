package graphs;

public class maxAreaIslands {
    static int count;
    static int temp;
    public static int maxAreaOfIsland(int[][] grid) {
        count = 0;
        int r = grid.length;
        int c = grid[0].length;

        boolean[][] vis = new boolean[r][c];
        for(int i = 0;i<r;i++){
            for(int j =0;j<c;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    temp = 0;
                    dfs(grid, vis, i, j, r, c);
                }
            }
        }


        return count;
    }

    private static void dfs(int[][] grid, boolean[][] vis, int i, int j, int r, int c) {
        if (i >= r || i < 0 || j < 0 || j >= c || vis[i][j] == true || grid[i][j] == 0) {
            return;
        }

        vis[i][j] = true;
        temp++;
        //System.out.println("i and j "+ i + " \t "+ j + " \t temp"+ temp);
        count = Math.max(count, temp);
        dfs(grid, vis, i - 1, j, r, c);
        dfs(grid, vis, i + 1, j, r, c);
        dfs(grid, vis, i, j + 1, r, c);
        dfs(grid, vis, i, j - 1, r, c);


    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

//        int[][] grid =  {{1,1,0,0,0},
//                {1,1,0,0,0},
//                {0,1,1,1,1},
//                {0,0,0,1,1}};
        System.out.println(maxAreaOfIsland(grid));
    }
}
