package dp;

public class lis {
    public static void main(String[] args) {
        int ans =  lisRecursive(new int[]{0,8,4,12,2,10,6,14,1,9,5 ,13,3,11,7,15}, 15);
        System.out.println(" lis "+ ans);
    }

    private static int lisRecursive(int[] arr, int n) {
        if(n ==0){
            return 1;
        }
        if(arr[n]>arr[n-1]){
            return 1+ lisRecursive(arr, n-1);
        }else{
            return Math.max(lisRecursive(arr, n-1), 1);
        }
    }
}
