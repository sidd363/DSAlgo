package strings;

public class shiftingLetters {
    public static String shiftingLetters(String s, int[][] shifts) {
        StringBuilder sb = new StringBuilder(s);

        for (int [] shift : shifts){
            int from = shift[0];
            int to = shift[1];
            int dir = shift[2];
            StringBuilder sbt = new StringBuilder(sb);

            for(int i = from;i<= to; i++){
                if(dir == 1) {
                    int toMove = (sbt.charAt(i)-'a'+1 + 26)%26;

                    sb.setCharAt(i, (char) (toMove+'a'));
                }
                else{
                    int toMove = (sbt.charAt(i)-'a'-1 + 26)%26;

                    sb.setCharAt(i, (char) (toMove+'a'));

                }
            }


        }
        return  sb.toString();
    }

    public static void main(String[] args) {
        String s = "dztz";
        int [][]shifts = {{0,0,0},{1,1,1}};
        // a c e
        //   1 2
        //   2 - 2
        String ans = shiftingLetters(s, shifts);
        System.out.println(" ans  --> "+ ans);
    }
}
