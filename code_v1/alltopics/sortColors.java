package alltopics;

public class sortColors {
    public static void sortColors(int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }


        for (int i :a) {
            System.out.print( i + " \t " );
        }
    }

    public static void main(String[] args) {
        sortColors(new int[]{1,0,2,1,1,0});
    }
}
