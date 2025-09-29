package twoPointers;

public class TimeNeededToRearrangeABinaryString {
    public static int secondsToRemoveOccurrences(String s) {
        int ans = 0;
        int end = 1;
        int start = 0;
        boolean prev = false;
        //  all occurrences of "01" are simultaneously replaced with "10". This process repeats until no occurrences of "01" exist.
        while(end<s.length()){
            if((s.charAt(start) == '0' && s.charAt(end) =='1' )|| (s.charAt(start) == '1' && s.charAt(end) =='1' && prev == true ) ){
                 ans++;
                 prev = true;

            }else {
                prev = false;
            }
            start ++;
            end++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(secondsToRemoveOccurrences("001011"));
        //010101
        //101010
        //110100
        //111000
    }
}
