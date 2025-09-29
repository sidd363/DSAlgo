package graphs;

public class noOfEnclaves {
    public static int numEnclaves(int[][] grid) {
        int ans = 0;
        int r = grid.length;
        int c = grid[0].length;

        boolean [][] vis = new boolean[r][c];

        for(int i =0;i<c;i++){
            if(grid[0][i]==1 && !vis[0][i]){
                dfs(grid, 0, i, r,c,vis);
            }
        }
        for(int i =0;i<r;i++){
            if(grid[i][0]==1 && !vis[i][0]){
                dfs(grid, i, 0, r,c,vis);
            }
        }
        for(int i =0;i<c;i++){
            if(grid[r-1][i]==1 && !vis[r-1][i]){
                dfs(grid, r-1, i, r,c,vis);
            }
        }
        for(int i =0;i<r;i++){
            if(grid[i][c-1]==1 && !vis[i][c-1]){
                dfs(grid, i, c-1, r,c,vis);
            }
        }

        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(grid[i][j]==1 && !vis[i][j]) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private static void dfs(int[][] grid, int i, int j, int r, int c, boolean[][] vis) {
        if(i<0 || i>=r || j<0||j>=c || grid[i][j]!=1 || vis[i][j]){
            return;
        }
        vis[i][j] = true;

        dfs(grid, i+1,j, r, c, vis );
        dfs(grid, i-1,j, r, c, vis );
        dfs(grid, i,j+1, r, c, vis );
        dfs(grid, i,j-1, r, c, vis );
    }

    public static void main(String[] args) {
        //int [][] grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}} ;
        int [][] grid = {{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};


        //
        System.out.println("number of enclaves "+numEnclaves(grid));
    }
}
