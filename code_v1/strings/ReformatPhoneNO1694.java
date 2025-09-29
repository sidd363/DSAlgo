package strings;

public class ReformatPhoneNO1694 {
    public static String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder("");
        for (char c: number.toCharArray()
             ) {
            if(Character.isDigit(c)) sb.append(c+"");
        }

        int length = sb.length();
        StringBuilder ans = new StringBuilder("");

        int quo = length/3;
        int counter = 0;
        int start = 0;
        if(length%3 == 0){
            while(counter< quo){
                ans.append(sb.substring(start, start+3));
                if(counter +1 != quo){
                    ans.append("-");
                }
                counter++;
                start = start +3;
            }
        }else if(length%3 == 1){
            int toadd = 3;
            while(counter<quo+1){
                if(counter + 1 < quo){
                    ans.append(sb.substring(start, start+toadd));
                    ans.append("-");
                }else if(counter + 1 >= quo) {
                    toadd = 2;
                    ans.append(sb.substring(start, start+toadd));
                    if(counter  != quo){
                        ans.append("-");
                    }
                }
                counter++;
                start = start + toadd;
            }
        }else{
            // q = 2 0,1,2 0<1
            while(counter<= quo-1){
                ans.append(sb.substring(start, start+3));
                if(counter != quo){
                    ans.append("-");
                }
                counter++;
                start = start +3;
            }
            while(counter<= quo) {
                ans.append(sb.substring(start, start + 2));
                counter++;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(reformatNumber("123--45"));
    }
}
