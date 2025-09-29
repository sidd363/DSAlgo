package stacks;

import java.util.Stack;

public class canonicalPath {
    public static String simplifyPath(String path) {
       //  "/a/./b/../../c/"
        char [] ch = path.toCharArray();
        Stack<String> st = new Stack<>();
        Stack<String> strev = new Stack<>();

        StringBuilder sb = new StringBuilder("");
        String [] sa = path.split("/");
        for(String str : sa){
            if(!str.equalsIgnoreCase("")){
                if(str.equalsIgnoreCase("..")){
                    if(!st.isEmpty()){
                        st.pop();
                    }
                }else{
                    if(!str.equalsIgnoreCase(".")) {
                        st.push(str);
                    }
                }
            }
        }
        //sb.append("/");
        if(st.empty()){
            return "/";
        }
        while (!st.empty()){
            strev.push(st.pop());
        }
        while (!strev.empty()){
            sb.append("/");
            sb.append(strev.pop());
        }

        return  sb.toString();
    }
    public static void main(String[] args) {
        // "/a/./b/../../c/"
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }
}
