package binarySearch;

public class minHour {
    public static  int minSpeedOnTime(int[] dist, double hour) {

        // range is 1 to max
        int low = 1;
        int high = 0;

        for(int i = 0;i<dist.length-1;i++){
            high = Math.max(dist[i], high);
        }

        int l = dist.length;
        if(l==1 ){
            return (int)((double)dist[0]/ hour);
        }


        int ans = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low+high)/2;
            //calculating hour
            double tsum = 0;
            for(int i =  0;i<dist.length-1;i++){
                int eachTime = dist[i]/mid;
                if(dist[i]%mid !=0)
                    eachTime++;
                tsum+= eachTime;
            }

            tsum+= (double) dist[l-1]/ (double) mid;
            System.out.println(" tsum"+ tsum + " mid --"+ mid);
            if(tsum<= hour){
                ans = Math.min(ans, mid);
                high = mid-1;

            }else if(tsum> hour){
                low = mid+1;

            }

        }


        return  ans == Integer.MAX_VALUE ? -1: ans;

    }

    public static void main(String[] args) {
        System.out.println(minSpeedOnTime(new int[]{1}, 1));
    }
}
