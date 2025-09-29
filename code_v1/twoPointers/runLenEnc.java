package twoPointers;

public class runLenEnc {
    public static String encode(String str)
    {
        //Your code here
        StringBuilder sb = new StringBuilder("");

        int beg = 0;
        int l = str.length();
        int end = 0;

        while (end<l){
            if(str.charAt(beg) == str.charAt(end)){
                end++;
            }else{
                sb.append(str.charAt(beg));
                sb.append(end-beg);
                beg = end;
                end++;
            }
        }
        sb.append(str.charAt(beg));
        sb.append(end-beg);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(" encoded -- "+ encode("aaaabbbcccaa"));
    }
}
