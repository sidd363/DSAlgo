package binarySearch;

public class shipWithinDdays {
    private static  boolean checkDays(int mid, int[] weights, int d){
        int days = 0;
        int currWeight = 0;
        for(int i = 0;i<weights.length;i++){
            currWeight+= weights[i];
            if(currWeight>mid){
                currWeight =  weights[i];
                if(currWeight>mid){
                    return false;
                }
                days++;
            }else if(currWeight==mid){
                currWeight =  0;
                days++;
            }
        }
        if(currWeight>0){
            days++;
        }
        //System.out.println(days + " mid "+ mid);
        if(days <= d){
            return true;
        }
        return false;
    }
    public static int shipWithinDays(int[] weights, int D) {
        int ans = 0;
        int low = 0;
        int high = (int)1e9;
        while(low<=high){
            int mid = (low+high)/2;
            if(checkDays(mid, weights, D)){
                high = mid-1;
                ans = mid;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[]{1,2,3,1,1}, 4));
    }
}
