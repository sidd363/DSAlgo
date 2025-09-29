package alltopics;

import java.util.LinkedHashSet;

public class Winner {

    public static int findTheWinner(int n, int k) {
        LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
        int curr = 0;
        int next = 0;
        for(int i = 0;i<n;i++){
            ls.add(i);
        }

        while(ls.size() > 1){
            int tofor = k;
            while(tofor > 0){
                curr = curr+1;
                if(!ls.contains(curr)){
                    curr = curr+1;
                }
                if(curr == n+1){
                    curr = 1;
                }
                tofor--;
            }
            ls.remove(curr);
            next = next - 1;
            // remove next;

            ls.remove(next);
            if(ls.size() ==1){
                break;
            }
            // assign curr = (next + 1 )%k;
            curr = (next + 1 )%n  ;


        }

        int ele = 0;

        for(int i : ls){
            ele = i;
            break;
        }
        return ele +1 ;

    }

    public static void main(String[] args) {
        System.out.println(" winner circular game is"+ findTheWinner(5,2));
    }
}
