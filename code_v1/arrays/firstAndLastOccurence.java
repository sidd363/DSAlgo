package arrays;

public class firstAndLastOccurence {

    public static void indexes(long v[], long x)
    {
        // Your code goes here
        int l = 0;
        int r = v.length-1;
        int first = -1;
        int last = -1;

        while(l<=r){

            int mid = (l+r)/2;
            long ele = v[mid];

            if(ele == x){
                //System.out.println(" mid -- "+ mid);

                if(mid == 0 || ele> v[mid-1]) {
                    first = mid;
                    l = mid+1;
                }

                if(mid == v.length-1 || ele < v[mid+1]){
                    last = mid;
                    r = mid -1;
                }
                if(mid>0 && mid < v.length-1 && ele == v[mid-1] && ele == v[mid+1]){
                    l = mid+1;
                    while(mid >0 && v[mid-1] == ele){
                        mid = mid-1;
                        first = mid;
                    }

                }
            }else if (ele > x){
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        System.out.println( " first "+ first + " last -- "+ last);

    }
    public static int findBitonicPoint(int[] arr, int n) {
        // code here
        int l = 0;
        int r = arr.length-1;


        while(l<=r) {

            int mid = (l + r) / 2;
            int ele = arr[mid];
            if(mid == arr.length-1){
                return arr[mid];
            }
            if(mid>0  && arr[mid-1] < ele && ele > arr[mid+1] ) {
                return ele;
            }else if(mid>0  && arr[mid-1] < ele && ele < arr[mid+1]) {
                l = mid + 1;
            }else if(mid>0  && arr[mid-1] > ele && ele > arr[mid+1]) {
                r = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // indexes(new long[]{1, 3, 5, 5, 5, 5, 5, 5, 5}, 5);
        int ans = findBitonicPoint(new int[]{1}, 1);
        System.out.println(ans);
    }
}
