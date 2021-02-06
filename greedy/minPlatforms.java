package greedy;

import static java.util.Arrays.sort;

public class minPlatforms {
    public static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        int ans = 0;

        sort(arr);
        sort(dep);

        ans++;
        int tmp = 1;
        int i = 1, j=0;
        while(i<n && j<n){
            if(arr[i]<= dep[j]){
                i++;
                tmp++;
                ans = Math.max(ans, tmp);
            }else{
                j++;
                tmp--;
            }
        }
        return ans;

    }

    public static class timings  {
        int at,dt;

        @Override
        public String toString() {
            return "timings{" +
                    "at=" + at +
                    ", dt=" + dt +
                    '}';
        }

        public timings(int ati, int dti){
            at = ati;
            dt = dti;

        }

        public timings(){
        }


    }

    public static void main(String[] args) {
        System.out.println(findPlatform(new int[]{900,  1100, 1235}, new int[]{1000, 1200 ,1240}, 3 ));
    }
}
