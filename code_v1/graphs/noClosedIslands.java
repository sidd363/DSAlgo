package graphs;

public class noClosedIslands {
    public static int closedIsland(int[][] grid) {
        int ans = 0;
        int r = grid.length;
        int c = grid[0].length;

        // boolean [][] vis = new boolean[r][c];

        for(int i =0;i<c;i++){
            if(grid[0][i]==0 ){
                dfs(grid, 0, i, r,c);
            }
        }
        for(int i =0;i<r;i++){
            if(grid[i][0]==0){
                dfs(grid, i, 0, r,c);
            }
        }
        for(int i =0;i<c;i++){
            if(grid[r-1][i]==0 ){
                dfs(grid, r-1, i, r,c);
            }
        }
        for(int i =0;i<r;i++){
            if(grid[i][c-1]==0 ){
                dfs(grid, i, c-1, r,c);
            }
        }

        for(int i =1;i<r;i++){
            for(int j =1;j<c;j++){
                if(grid[i][j]==0) {
                    dfs(grid, i, j, r,c);
                    ans++;
                }
            }
        }
        return ans;
    }

    private static void dfs(int[][] grid, int i, int j, int r, int c) {
        if(i<0 || i>=r || j<0||j>=c || grid[i][j]!=0 ){
            return;
        }
        grid[i][j] = 1;

        dfs(grid, i+1,j, r, c );
        dfs(grid, i-1,j, r, c );
        dfs(grid, i,j+1, r, c );
        dfs(grid, i,j-1, r, c );
    }

    public static void main(String[] args) {
        int [][] grid = {{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}};
        System.out.println(closedIsland(grid));
    }
}
