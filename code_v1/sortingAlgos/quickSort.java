package sortingAlgos;

public class quickSort {

    static void Swap(int[] array,
                     int position1,
                     int position2)
    {
        // Swaps elements in an array

        // Copy the first position's element
        int temp = array[position1];

        // Assign to the second element
        array[position1] = array[position2];

        // Assign to the first element
        array[position2] = temp;
    }

    public static int partitionLomuto(int []ar, int l , int h){

            int smallWindowSize = l-1;
            int pivot = ar[h];

            for(int j = l; j<=h-1; j++){
                if (ar[j] <= pivot) {
                    smallWindowSize++;

                    Swap(ar, smallWindowSize, j);

                }
            }
            Swap(ar, smallWindowSize + 1, h);
            return smallWindowSize+1;

    }
    public static void quickSortUsingLomuto(int []ar, int l , int h){
        System.out.println(" quick sort "+ l + " high "+h);
        if(l<h) {
            int p = partitionLomuto(ar, l, h);
            quickSortUsingLomuto(ar, l, p-1 );
            quickSortUsingLomuto(ar, p+1, h);
        }

    }



    //
    public static void main(String[] args) {
        int [] ar = new int[]{10, 9, 20, 30, 5, 7, 8};
        //int pivotIndex = partitionLomuto(ar, 0, ar.length);
        quickSortUsingLomuto(ar, 0, ar.length-1);
        for (int i :ar){
            System.out.print(" arr ele \t"+ i);
        }
        System.out.println();
        //System.out.println(" pivot is "+ pivotIndex);

    }
}
