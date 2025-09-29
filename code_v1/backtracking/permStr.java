package backtracking;

public class permStr {

    public static  void printperm(String str){
        int l = 0;
        int h = str.length();
        print(l, h-1, str);
    }

    private static void print(int l, int h, String str) {
        if(l>h){
            return;
        }
        if(l==h){
            System.out.println(" perm is "+ str);
        }


        for(int i = l; i<=h; i++){
            // swap
            str = swap(str, i, l);
            // swap l h  ABC ACB BAC BCA CBA CAB.
            print(l+1 , h, str );

            str = swap(str, i, l);

        }
    }

    public static String swap(String s, int l , int h){
        char [] ch = s.toCharArray();
        char t = ch[l];
        ch[l] = ch[h];
        ch[h] = t;
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        printperm("abc");
    }
}
