

public class leet167 {
    public static int[] twoSum(int[] numbers, int target) {
        int ans [] = new int[2];
        int l = numbers.length;
        int s =0, h = l-1;
        while(s<h) {
        	if(numbers[s]+numbers[h]==target) {
        		ans[0] = s+1;
        		ans[1] = h+1;
        		break;
        	}else if(numbers[s]+numbers[h]>target) {
        		h--;
        	}else  {
        		s++;
        	}
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,3, 4 ,15};
		int [] ans = twoSum(a, 18);
		for(int i :ans) {
			System.out.print(" i "+i);
		}
		System.out.println();
	}

}
