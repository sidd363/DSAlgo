package hashing;

import java.util.*;

public class KSUMsmallest {
    public static void ksum(List<Integer> al , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i :al){
            if(pq.size()<k){
                pq.add(i);
            }else{
                int peek =  pq.peek();
                if(peek > i){
                    pq.poll();
                    pq.add(i);
                }
            }
        }
        int sum =0;
        while(!pq.isEmpty()){
            sum+= pq.poll();
        }
        System.out.println(sum);

    }




    public static int kdiff(int a[], int n, int k)
    {
        Arrays.sort(a);

        int low = a[1] - a[0];
        for (int i = 1; i <= n-2; ++i) {
            low = Math.min(low, a[i + 1] - a[i]);
        }

        int high = a[n-1] - a[0];

        while (low < high)
        {
            int mid = (low + high)/2;
            if (countPairs(a, n, mid) < k) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }

        return low;
    }
    public static int ng(int a[], int n, int value)
    {
        int low = 0;
        int high = n;
        while(low < high)
        {
            int mid = (low + high)/2;
            if(value >= a[mid])
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }

    public static int countPairs(int[] a, int n, int mid)
    {
        int res = 0;
        for(int i = 0; i < n; i++)
        {
            int ngmid = ng(a, n, a[i]+mid);
            res += (ngmid- i+1);
        }
        return res;
    }


    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while(t-- >0 ){
            int n = sc.nextInt();
            int s =n;
            int k = sc.nextInt();
            int[] al = new int[s];
            while(n>0){
                int ele = sc.nextInt();
                al[s-n]=ele;
                n--;
            }
            kdiff(al,s, k);
        }
    }
}
