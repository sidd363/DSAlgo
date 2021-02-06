package sortingAlgos;

public class insertionSort {
    private static int [] arr;


    public static void algo(){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int ele = arr[i];
            int index = i;
            for(int j = i-1;j>=0;j--){
                if(arr[j]< ele){
                    break;
                }else{
                    int tmp = arr[j];
                    arr[j] = arr[index];
                    arr[index] = tmp;
                    index = j;
                }
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("implementing insertion sort algo");
        arr = new int[]{2, 5, 40, 60, 1, 10};
        algo( );
        for(int i : arr){
            System.out.print(i+"\t");
        }
    }
}
