package bitManipulation;

public class countTotalsetBits {
    public static int countTotalSetBits(int n){
        int ans = 0;
        //algo
        // find number that is 2 power x and that is lower than n
        // find set bits till that number -1 for 11 that numebr is 8 so first find till 0-7  then 8-11 find first set bit then recur for remaining
        // 2 pow x-1 * (x-1)
        //000
        //001
        //010
        //011
        //100
        //101
        //110
        //111
        //1000
        //1001
        //1010
        //1011
        // total 4 + 4 + 4 = 2 *(3-1)*3
        if(n==0){
            return 0;
        }
        int x = findXraiseto2lessThanN(n);

        int xraisetopowx =( (1<< (x-1)) * x );
        int fromXtoNHighBit = (n-(1<<x) +1) ;
        int rest = countTotalSetBits(n - (1<<x)) ;

        ans = xraisetopowx + fromXtoNHighBit + rest;



        return ans  ;
    }
    private static int findXraiseto2lessThanN(int n){
        int x = 0;
        // 2 pow 0 then 2 pow1 then 2pow2 then 2pow3 then 2pow4
        while((1<<x) <= n){
            x++;
        }
        return x-1;
    }
    public static void main(String[] args) {
        //846928043
        System.out.println(" total set bits from 1 to n are -- "+ countTotalSetBits(3));
    }
}
