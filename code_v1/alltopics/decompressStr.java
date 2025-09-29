package alltopics;

import java.util.Stack;

public class decompressStr {
    public static String decompressStrring(String comps){

        Stack<StringBuilder> st = new Stack<>();
        Stack<Integer> multiplier = new Stack<>();

        int k = 0;
        StringBuilder sb = new StringBuilder();

        int i=0;
        while(i < comps.length()) {

            char ch = comps.charAt(i);

            if(Character.isDigit(ch)) {
                int count = 0;
                int pow = 0;
                while(i < comps.length() && Character.isDigit(comps.charAt(i))) {
                    int digit = comps.charAt(i) - '0';
                    count = 10 * count + digit;
                    pow++;
                    i++;
                }
                multiplier.push(count);
            } else if(Character.isAlphabetic(ch)) {

                sb.append(ch);
                i++;

            } else if(ch == '[') {

                st.push(sb);
                sb = new StringBuilder();
                i++;

            } else if(ch == ']') {

                StringBuilder decodedString = st.pop();
                int count = multiplier.pop();

                while(count>0) {
                    decodedString.append(sb);
                    count--;
                }
                sb = decodedString;

                i++;
            }

        }

        return sb.toString();



    }
    public static void main(String[] args) {
        System.out.println(decompressStrring("3[a2[c]]"));
    }
}
