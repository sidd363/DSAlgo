package arrays;

public class longestSubarrayEvennOdd {
    public static int maxEvenOdd(int arr[], int n)
    {
        // your code here
        int ans = 0;
        boolean status = arr[0]%2 ==0; // even
        int streak = 1;
        for(int i = 1; i<n; i++){
            boolean curr = arr[i]%2==0;
            if(curr != status ){
                streak++;
            } else{
                streak = 1;
            }
            status = curr;
            ans = Math.max(ans, streak);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int a[] = {10,12,14,7,8};
        System.out.println(maxEvenOdd(a, n));
    }
}
