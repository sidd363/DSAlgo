package recursion;

import java.util.ArrayList;

public class LexSORT {
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        util(ans, 0, s.toCharArray() , sb );
        return  ans;

    }

    private static void util(ArrayList<String> ans, int index, char[] strCharArr, StringBuilder sb) {
        if(index >= strCharArr.length){
            ans.add(sb.toString());
            return;
        }
        sb.append(strCharArr[index]+""); // take
        util(ans, index+1,strCharArr , sb );
        sb.deleteCharAt(sb.length()-1);
        // no take
        util(ans, index+1,strCharArr , sb);
    }

    public static void main(String[] args) {
        System.out.println(" all lex sorted set " + powerSet("abc"));
    }
}
