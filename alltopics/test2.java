package alltopics;

public class test2 {

    static int findKth(int[] A, int k){
        int ans = 1;
        int tmp = k;
        int min = 1;
        for(int i = 0;i<A.length;i++){
            // find diff bw  min and arr i
            if(i==0){
                int diff = A[i] - min;
                if(diff == 1){
                    k--;
                    if(k==0){
                        return min;
                    }
                }
            }else {
                int diff = A[i] - A[i-1];
                if(diff != 1){
                    k = k - diff;
                    if(k ==0){
                        return A[i-1] + diff;
                    }else if(k<0){
                       // A[i] - k;
                    }
                }
            }

        }

        return ans;
    }

    public static void segregateEvenOdd(int[] a){
        int l = 0;
        int h = a.length-1;

        while(l<h){
            if(a[l]%2==0){
                l++;
            }else if(a[h]%2!=0){
                h--;
            }else{
                //if(l<h){
                    int tmp = a[l];
                    a[l] = a[h];
                    a[h] = tmp;
                    l++;
                    h--;
                //}
            }
        }


    }
    public static void main(String[] args) {
        //System.out.println(findKth(new int[]{2,3,4,7,11}, 5));
//    Test test = new Test();
//    test.add(3, "three");
//    test.add(2, 2);
//    test.add(1, "one");
//    test.add(6, 6);
//    test.display();
        String[][] data = {{}, {"pres"}};
       // data.stream().flatMap(d-> Arrays.stream(d)).findFirst().orElse("1123");
      //segregateEvenOdd(new int[]{2,3,4,7,11});
    }
}
