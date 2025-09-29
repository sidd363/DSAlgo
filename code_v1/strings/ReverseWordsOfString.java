package strings;

public class ReverseWordsOfString {
    public static String reverseWords(String s) {
      StringBuilder sb = new StringBuilder("");
      String[] splitted = s.split(" ");
        for (String each:splitted) {
            System.out.println(each + " each length "+ each.length());
        }
      for(int i = splitted.length-1; i>=0;i--){
          if(!splitted[i].equals(" ")){
              sb.append(splitted[i]);
              if(i!=0) sb.append(" ");
          }
      }

      return sb.toString();
    }
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
}
