package graphs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class NetwrkDelay {
    public static int networkDelayTime(int[][] times, int n, int k) {
        // dijikstra algo using adjacency list rpt
        Map<Integer, Map<Integer, Integer>> hm = new HashMap<>();
        for(int [] time : times){

            hm.putIfAbsent(time[0],new HashMap<>());
            hm.get(time[0]).put(time[1], time[2]);
        }

        boolean[] visited = new boolean[n];

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, k});
        int res = 0;

        while(pq.size()>0){
            int[] tmp = pq.poll();
            int node = tmp[1];
            int dist = tmp[0];
            res = dist;
            n--;
            if(n==0){
                return res;
            }
            if(visited[node] == true){
                continue;
            }
            visited[node] = true;

            if(hm.containsKey(node)){
                Map<Integer, Integer> map = hm.get(node);
                for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                    pq.add(new int[]{entry.getValue() + dist, entry.getKey()});
                }
            }


        }
        if(n==0){
            return  res;
        }
        return  -1;
    }
    public static void main(String[] args) {
        //times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
        int [][] times = {{2,1,1}, {2,3,1}, {3,4,1}};
        System.out.println(networkDelayTime(times, 4, 2));
    }
}
