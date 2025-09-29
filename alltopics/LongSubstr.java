package alltopics;

public class LongSubstr {
    public static String longestValidString(String str) {
        // WRITE YOUR BRILLIANT CODE HERE

        int beg = 0;
        int end = 2;
        StringBuilder sb  = new StringBuilder(str.substring(beg, end));
        StringBuilder tmp  = new StringBuilder(str.substring(beg, end));
        while(end< str.length()){

            if(str.charAt(end)!= str.charAt(end-1) || str.charAt(end)!= str.charAt(end-2)){
                tmp.append(str.charAt(end));
            }else{
                // same eee
                tmp = new StringBuilder(str.substring(end-1, end+1));

            }
            end++;

            if(tmp.length() > sb.length()){
                sb = new StringBuilder(tmp);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(" longest valid "+ longestValidString("aabbaabbaabbaaa"));
    }
}
