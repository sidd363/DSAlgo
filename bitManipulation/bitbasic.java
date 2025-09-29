package bitManipulation;

public class bitbasic {
    public static void main(String[] args) {
        int x = 0;
        // 2^32 - 1 -x
        //System.out.println(~x);
        System.out.println(countBitFlips(20, 25));
    }
    public static int countBitFlips(int a, int b){
        int x = a^b;
        int ans =0;
        while(x>0){
            x = x& (x-1);
            ans++;
        }
        return ans;
    }
}
