package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class knightWalk {

    public static int minStepToReachTarget(int knightPos[], int targetPos[], int n)
    {
        // Code here
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        knightPos[0] = knightPos[0]-1;
        knightPos[1] = knightPos[1]-1;

        targetPos[0] = targetPos[0]-1;
        targetPos[1] = targetPos[1]-1;

        q.add(knightPos);
        int[][]dirs = new int[][]{{-2,-1},{-1,-2}, {-2,1},{-1,2}, {1,-2},{1,2}, {2,-1},{2,1}};
        boolean[][] vis = new boolean[n][n];
        //vis[knightPos[0]][knightPos[1]] = true;
        while(!q.isEmpty()){
            int s = q.size();
            count++;
            while(s-- > 0) {
                int[] tmp = q.poll();
                int x = tmp[0];
                int y = tmp[1];
                if(x == targetPos[0] && y == targetPos[1]){
                    return count;
                }
                vis[x][y] = true;
                for (int[] dir : dirs) {
                    int tx = dir[0] + x;
                    int ty = dir[1] + y;

                    if(tx>=0 && tx <n && ty>=0 && ty<n && vis[tx][ty] != true){
                        if(tx == targetPos[0] && ty == targetPos[1]){
                            return count;
                        }else{
                            vis[tx][ty] = true;
                            q.add(new int[]{tx, ty});
                        }
                    }
                }
            }

        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(" min steps to reach target is "+ minStepToReachTarget(new int[]{1,1}, new int[]{30,30}, 30));
    }
}
