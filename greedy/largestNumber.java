package greedy;

public class largestNumber {
    public static String largestNumber(int n, int sum)
    {
        // add your code here
        StringBuilder sb = new StringBuilder();
        if(n*9 < sum){
            return "-1";
        }
        while(n>0){
            int tmp = 9;
            if(sum==0){
                sb.append("0");
            }else{
                while(tmp>sum){
                    tmp--;
                }
                sum = sum - tmp;
                sb.append(tmp);
            }
            n--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(largestNumber(3, 29));
    }
}
