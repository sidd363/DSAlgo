package arrays;

import java.util.Arrays;

public class sort012 {
    public static void sortFunc(int [] arr){
        int l=0, m=0, h = arr.length-1;

        while(m<=h){
            if(arr[m]==0){
                if(l<m) {
                    int tmp = arr[l];
                    arr[l] = arr[m];
                    arr[m] = tmp;
                    l++;
                }else{
                    m++;
                }
            }else if(arr[m]==1){
                m++;
            }else if(arr[m]==2){
                //if(m<h) {
                    int tmp = arr[m];
                    arr[m] = arr[h];
                    arr[h] = tmp;
                    h--;
//                }else{
//                    m++;
//                }
            }
        }
    }
    public static void main(String[] args) {
        int [] ar = {1,0, 2};
        sortFunc(ar);
        Arrays.stream(ar).forEach(System.out::println);
       // Arrays.stream(ar).forEach(System.out::println);

        //System.out.println(Arrays.stream(ar).count());
        //System.out.println(Arrays.stream(ar).count());
    }
}
