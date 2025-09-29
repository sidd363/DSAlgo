package twoPointers;

public class subArrayWithMinlenSum {

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 0, 19};
        int x  =  51;

        int b=0, e=0;
        int n = arr.length;
        int tsum = 0;
        int ans = n+1;
        while(e<n){
            tsum+=arr[e++];
            while (tsum>x){
                ans = Math.min(ans, e-b);
                tsum = tsum - arr[b];
                b++;
            }
        }
        System.out.println("min len "+ ans);
    }

}
