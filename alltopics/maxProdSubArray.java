
public class maxProdSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {-3,0,1,-2};
		int max = Integer.MIN_VALUE;
		for(int i =0;i<a.length;i++) {
			int tmp = a[i];
			System.out.println("tmp ==="+tmp);
			for(int j=i+1;j<a.length;j++) {
				if(max <tmp) {
					max = tmp;
				}
				tmp *=a[j];
				
			}
			if(max <tmp) {
				System.out.println(" max changed");
				max = tmp;
			}
		}
		
		System.out.println("ma xprod  " + max);
	}

}
