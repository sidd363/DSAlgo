package heaps;

import java.util.*;

public class kClosestPointsToOrigin {

    public static  int [][]  kClosest(int[][] points, int k) {
        int [][] ans = new int[k][2];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for(int i = 0;i<points.length;i++){
            int dis = Math.abs(points[i][0] - 0)* Math.abs(points[i][0] - 0) + Math.abs(points[i][1] - 0)* Math.abs(points[i][1] - 0) ;
            if(pq.size()==k){
                if(pq.peek()> dis){
                    pq.poll();
                    pq.add(dis);
                    if(hm.containsKey(dis)){
                        List<Integer> index = hm.get(dis);
                        index.add(i);
                        hm.put(dis, index);
                    }else{
                        List<Integer> index = new ArrayList<>();
                        index.add(i);
                        hm.put(dis, index);
                    }

                }
            }else{
                pq.add(dis);
                if(hm.containsKey(dis)){
                    List<Integer> index = hm.get(dis);
                    index.add(i);
                    hm.put(dis, index);
                }else{
                    List<Integer> index = new ArrayList<>();
                    index.add(i);
                    hm.put(dis, index);
                }
            }
        }
        int i = 0;
        while(pq.size() >0  && i<k){
            int index = pq.poll();
            List<Integer> il = hm.get(index);
            if(il.size()==1){
                ans[i++] =  points[il.get(0)];
            }else{
                for(int ele : il){
                    if(i <k){
                        ans[i++] =  points[ele];
                    }else{
                        return ans;
                    }
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int [][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        for(int[] i : kClosest(points, k)){
            System.out.println(i[0] + " second "+ i[1]);
        }
        //System.out.println();
        //kClosest(points, k);
    }
}

