package alltopics;

public class calculateMoney {

    public static int totalMoney(int n) {
        int money = 0;
        int q = n/7;
        int r = n%7;

        int f =0;
        for(int i = 0;i<q;i++){
            f = f+1;
            money+= (7*(2*f+ (6)*1)/2);
        }
        f= money==0 ? 1:f+1;
        money+= r*0.5*(2*f+(r-1));


        return money;

    }
    public static void main(String[] args) {
        System.out.println("money "+ totalMoney(26));
    }
}
