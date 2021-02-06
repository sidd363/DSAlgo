package sortingAlgos;

import java.util.ArrayList;
import java.util.List;

public class insertIntervals {
    public static int[][] insert(int[][] ar, int[] newInterval) {
//        if(ar.length ==0){
//            int [][] ans = new int[1][2];
//            ans[0] = newInterval;
//            return ans;
//        }
//        boolean ismergd = false;
//        int res = -1;
//        for( int i =0; i<ar.length; i++){
//            int [] tmp = ar[i];
//            //check if overlap
//            if( !ismergd && tmp[0]< newInterval[1] &&( tmp[0]>= newInterval[0]|| tmp[1]> newInterval[0]) ){
//                tmp[0] = Math.min(newInterval[0],tmp[0] );
//                tmp[1] = Math.max(newInterval[1],tmp[1] );
//                res++;
//                ar[res] = tmp;
//                ismergd = true;
//            }else if(ismergd && tmp[0]<= ar[res][1] ){
//                tmp[0] = Math.min(ar[res][0],tmp[0] );
//                tmp[1] = Math.max(ar[res][1],tmp[1] );
//                ar[res] = tmp;
//            }else{
//                res++;
//                if(res<ar.length){
//                    ar[res]= tmp;
//                }else{
//                    res--;
//                    break;
//                }
//            }
//        }
//        int size = ismergd == true ? res: res+1;
//        int [][] ans = new int[size+1][2];
//        for(int i = 0;i<=res;i++){
//            int [] tmp = ar[i];
//            ans[i] = tmp;
//        }
//        if(!ismergd){
//            ans[size] = newInterval;
//
//        }
        List<int[]> ans = new ArrayList<>();

        for(int[] interval :ar){
            if(newInterval[0]> interval[1]){
                ans.add(interval);
            } else if(newInterval[1]< interval[0]){
                ans.add(newInterval);
                newInterval = interval;
            }else{
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        ans.add(newInterval);

        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        int [][] ar = new int[1][2];
        ar[0] = new int[]{1,5};
//        ar[1] = new int[]{3,5};
//        ar[2] = new int[]{6,7};
//        ar[3] = new int[]{8,10};
//        ar[4] = new int[]{12,16};

        int[][]  ans = insert( ar,new int[]{0,0});

        System.out.println(" insert intervals called ");
        for(int[] i :ans ){
            System.out.println(" elements "+i[0]+"\t"+i[1]);
        }
    }
}
