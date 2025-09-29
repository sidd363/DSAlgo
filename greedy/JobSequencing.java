package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {
    public static class Job{
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }
    public static class JobComp implements Comparator<Job> {

        @Override
        public int compare(Job o1, Job o2) {
            return 0;
        }
    }

    static int[] JobScheduling(Job arr[], int n)
    {
        // Your code here

        int[] res = new int[2];
        int jc = 0;
        int profit = 0;

        Arrays.sort(arr, (a, b)->(b.profit - a.profit));

        int maxDeadline = -1;

        for(Job job :arr){
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        boolean[] vis = new boolean[maxDeadline+1];

        for(Job job :arr){

            for( int j = job.deadline; j>0; j--){
                if(vis[j]!= true){
                    jc++;
                    vis[j] = true;
                    profit+= job.profit;
                    break;
                }
            }
        }


        res[0] = jc;
        res[1] = profit;
        return res;



    }
    public static void main(String[] args) {
        //{(1,4,20),(2,1,10),(3,1,40),(4,1,30)}

        Job job1 = new Job(1, 4, 20);
        Job job2 = new Job(2,1,10);
        Job job3 = new Job(3,1,40);
        Job job4 = new Job(4,1,30);

        Job arr[] = {job1, job2, job3, job4};

        int[] res =   JobScheduling(arr, 4);

        System.out.println(" job profit" + res[1]);
        System.out.println(" job counts " + res[0]);
    }
}
