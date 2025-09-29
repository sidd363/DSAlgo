package binarySearch;

public class medianTwoSortedArr {


    public static int findMedian(int arr[], int n, int brr[], int m){
        //Your code here
        if(n>m){
            int []tmp  = brr;
            brr =  arr;
            arr = tmp;
            int t = m;
            m = n;
            n = t;
        }
        int median = 0;
        int begin1 = 0;
        int end1= n;
        int mid1 = 0;

        while (begin1<end1){
            mid1 = (begin1+end1)/2;

            int mid2 = ((n+m+1)/2) - mid1;

            int min1, max1, min2, max2;
            // min and max
            min1 = mid1+1 >= n ? Integer.MAX_VALUE :arr[mid1+1];
            max1 = mid1-1 < 0 ? Integer.MIN_VALUE: arr[mid1-1];
            min2 = mid2+1 >= m ? Integer.MAX_VALUE :brr[mid2+1];
            max2 = mid2-1 < 0 ? Integer.MIN_VALUE: brr[mid2-1];
            if(min1>= max2 && min2>= max1){
                if((n+m)%2==0){
                    //even
                    median = (Math.max(max1, max2)+ Math.min(min1, min2))/2;
                    return median;
                }else{
                    // odd case
                    median = Math.max(max1, max2);
                    return median;
                }
            }else if(min1<max2){
                begin1 = mid1+1;
            }else{
                end1 = mid1-1;
            }
        }

        return  median;

    }

    public static void main(String[] args) {

        int median = findMedian(new int[]{1,2,3,4,5}, 5,new int[]{3,4,5,6,7,8} ,6);
        System.out.println(" median "+ median);
    }


}
