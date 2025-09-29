package arrays;

public class MaxTimesOccurringMinElement {

    public static int maxOccured(int n, int l[], int r[], int maxx) {

        int left = l[0], right = maxx;
        int ans = 0;
        int lc = 1;
        for(int i = 0; i<n;i++){
            if(l[i]> left){
                ans = left;
                left = l[0];
                lc = 1;
            }else{
                lc++;

            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4, l[] = {1,4,3,1}, r[] = {15,8,5,4}, maxx = 15;
        System.out.println("max occured "+ maxOccured(n, l, r , maxx));
    }
}
