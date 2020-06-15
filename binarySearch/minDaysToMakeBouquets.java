package binarySearch;

public class minDaysToMakeBouquets {

    public static int minDays(int[] a, int m, int k) {
        int ans = -1;
        if (m * k > a.length) {
            return ans;
        }
        // binary search on answers
        int low = 0, high = (int)1e9;
        while(low <= high){
            int mid= (low+ high)/2;
            if(check(mid, a, m, k)){
                ans = mid;
                high = mid-1;
            }else{

                low = mid+1;
            }

        }
        return ans;

    }

    private static boolean check(int mid, int[] a, int noOfBouquetsReq, int flowersinBouquet) {
        int totalBouquet = 0, flowers = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i] <= mid){
                flowers++;
                if(flowers==flowersinBouquet){
                    totalBouquet++;
                    flowers=0;
                }
            }else{
                flowers = 0;
            }
        }
        if(totalBouquet >= noOfBouquetsReq){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(minDays(new int[]{7,7,7,7,12,7,7}, 2, 3));
    }
}
