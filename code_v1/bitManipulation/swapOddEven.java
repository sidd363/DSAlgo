package bitManipulation;

public class swapOddEven {
    public static int swapBits(int n)
    {
        // Your code
        System.out.println(" initiall "+ Integer.toBinaryString(n)); // initiall 10111
        for(int i = 0;i<32;i = i+2){
            // if both set do nothing
            int even = n & (1<<i);
            int odd = n &(1<<i+1);
            if((even==0 && odd!=0) || (even!=0 && odd==0)){
                n = n ^ (1<<i);
                n = n ^ (1<<i+1);
            }
            // if i set and i+1 unset reverse them i.e xor them
            // if i unset and i+1 unset do nothing
        }
        System.out.println(" after "+ Integer.toBinaryString(n));

        return n;
    }
    public static void main(String[] args) {
        System.out.println(swapBits(23));
    }
}
