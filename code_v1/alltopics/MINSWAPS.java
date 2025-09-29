
public class MINSWAPS {
	
	public static int minSwaps(int[] data) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == 1) {
				count++;
			}
		}
		if (count <= 1) {
			return 0;
		}
		int cur = 0, left = 0, right = count;
		for (int i = left; i < right; i++) {
			if (data[i] == 1) {
				cur++;
			}
		}
		int minSwap = count - cur;
		System.out.println("minswap initial "+ minSwap);
		while (right < data.length) {
			System.out.println("minswap left "+ left);
			System.out.println("minswap right "+ right);
			if (data[left++] == 1) {
				cur--;
			}
			System.out.println("cur in left  funct "+ cur);
			if (data[right++] == 1) {
				cur++;
			}
			System.out.println("cur after right  "+ cur);
			System.out.println("count - cur in funct "+  (count - cur));
			minSwap = Math.min(minSwap, count - cur);
			System.out.println("minswap in funct "+ minSwap);
			System.out.println("---------------->>>>");
		}
		return minSwap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,0,1,0,0,1};
       System.out.println(minSwaps(a));
	}

}
