package binarySearch;

public class kokobananas {
    public static int minEatingSpeed(int[] piles, int H) {
        int ans = 0;
        int low = 1;
        int high = 0;
        for(int i :piles){
            high = Math.max(high, i);
        }
        while(low<= high){
            int mid = low+(high-low)/2;

            if(checkbanana(piles, mid, H)){
                high = mid-1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }
    private static boolean checkbanana(int[] piles, int mid, int threshold) {
        int count = 0;

        for(int i = 0;i<piles.length;i++){
            int q = piles[i]/mid;
            int r = piles[i]%mid;
            if(r !=0){
                q++;
            }
            count+= q;
        }
        if(count <= threshold){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{3,6,7,11}, 8));
    }
}
