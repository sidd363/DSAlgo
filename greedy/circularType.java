package greedy;

public class circularType {
    public static int getcount(String s){
        int ans = 0;
        char prev = 'a';
        for(char c : s.toCharArray()){
            int diff = Math.abs(c-prev);
            int rem = 26-diff;
            ans += Math.min(rem, diff);
            prev = c;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println( getcount("azgb"));
    }
}
