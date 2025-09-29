package greedy;

import java.util.*;

public class solution {
    public static int getIntValue(String start){
        StringBuilder str = new StringBuilder("");
        for (char c : start.toCharArray()) {
            if (c != ':') {
                str.append(c);
            }
        }
        System.out.println(" str "+ str);
        return Integer.valueOf(str.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int [] st = new int[n];
            int[] et = new int[n];
            for(int i = 0;i<n;i++){
                String subname = sc.next();
                String start = sc.next();
                String end = sc.next();
                //
                System.out.println(" subname "+ subname);

                System.out.println(" starrt "+ start);
                System.out.println(" end "+ end);

                st[i] = getIntValue(start);
                et[i] = getIntValue(end);
            }
            findMaxSub(st, et, n);
        }
        for (int n = 0; n < t; n++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }

    private static void findMaxSub(int[] st, int[] end, int n) {
        Arrays.sort(st);
        Arrays.sort(end);
        int max = 1;
        int endMax = end[0];
        int tmp=1;
        int j = 1;
        for(int i = 1;i<st.length && j<end.length;){
            if(st[i] <= end[j-1]){
                tmp++;
                endMax = Math.max(end[i], endMax);
                max = Math.max(tmp, max);
                i++;
            }else{
                tmp--;
                j++;
            }
        }
        System.out.println(max);
    }
}
