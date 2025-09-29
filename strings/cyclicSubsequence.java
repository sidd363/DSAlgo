package strings;

public class cyclicSubsequence {

    public static boolean canMakeSubsequence(String s, String t) {
        return isSubsequence(s, t);
    }
    public static boolean isSubsequence(String s, String t) {
        return util(s, t, s.length()-1, t.length()-1, true);
    }
    public static boolean util(String s, String t, int sl, int tl, boolean canChange) {
        if(tl<0){
            return true;
        }
        if(sl < 0 ){
            return false;
        }
        // System.out.println(sl + " -- sl" + " tl " + tl + " s "+s);
        if(s.charAt(sl) == t.charAt(tl)){
            return util(s, t, sl-1, tl-1, true);
        }

        boolean removeChar = util(s, t, sl-1, tl, true)  ;


        boolean replaceChar = false;

        if(canChange == true){
            int next = (s.charAt(sl) - 'a' +1)%26;
            char nextc = (char) (next + 'a');
            //System.out.println("next int "+ nextc + " curr "+ s.charAt(sl) + " sl " + sl);

            StringBuilder string = new StringBuilder(s);
            string.setCharAt(sl, nextc);

            //System.out.println("sub "+  string);
            replaceChar = util(string.toString(), t, sl, tl, false) ;
        }

        return removeChar || replaceChar;

    }
    public static void main(String[] args) {
        System.out.println("as ssss "+ canMakeSubsequence("zc","ad"));
    }
}
