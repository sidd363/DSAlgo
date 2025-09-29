package alltopics;

public class kbeauty {
    public static int divisorSubstrings(int num, int k) {
        int ans = 0;
        // find all k substrings and check if its modulus with num is 0
        String strNum = String.valueOf(num);
        char [] ca = strNum.toCharArray();
//        if(k == 1){
//            for(int i = 0; i< ca.length -k+1; i = i+1){
//                String tstr = String.valueOf(ca, i, k);
//                int intstr = Integer.valueOf(tstr);
//                if( intstr != 0 && (num % intstr == 0)){
//                    ans++;
//                }
//            }
//            return  ans;
//        }
        for(int i = 0; i< ca.length -k+1; i++){
            String tstr = String.valueOf(ca, i, k);
            int intstr = Integer.valueOf(tstr);
            if( intstr != 0 && (num % intstr == 0)){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(divisorSubstrings(10, 1));
    }
}
