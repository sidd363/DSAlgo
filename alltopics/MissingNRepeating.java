package alltopics;

public class MissingNRepeating {
   static int[] findTwoElement(int arr[], int n) {
        // code here
       int[] ans = new int[2];

       for(int i = 0;i<n;i++){

           int valueAbs =  Math.abs(arr[i]);

           if(arr[valueAbs-1] >0) {
               arr[valueAbs-1] = -1 * arr[valueAbs-1];
           }else{
               // this is already made neg so it is repeating
               ans[1] = valueAbs;
           }
       }
       for(int i = 0;i<n;i++){
           if(arr[i]> 0 ){
               ans[0]=i+1;
               break;
           }
       }

       return ans;
    }

    public static void main(String[] args) {
       int [] ans = findTwoElement(new int[]{1,2,4,4}, 4);
        System.out.println(" find two "+ ans[0]+ " \t "+ ans[1]);
    }
}
