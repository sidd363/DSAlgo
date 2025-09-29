public class MaxPointsFromCards {
    public static int maxScore(int[] arr, int k) {
        int ans = 0, currentSum =0;
        for(int i =0;i<k;i++){
            currentSum += arr[i];
        }
        ans = currentSum;
        int r = arr.length-1;
        while(k>0){
            currentSum -= arr[k-1];
            currentSum += arr[r];
            ans = Math.max(currentSum, ans);
            r--;
            k--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] cards = {11,49,100,20,86,29,72};
        int k = 4;
        System.out.println("max score "+ maxScore(cards, k));
    }
}
