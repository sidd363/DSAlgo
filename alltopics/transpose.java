
public class transpose {

	
   public static int[][] transpose (int[][] A) {
        
        if(A==null){
            return A;
        }
        
        int nr = A.length;
        int nc = A[0].length;
        
        int ans [][]= new int[nc][nr];
        
        for(int i=0;i<nr;i++){
        	
            for(int j=0;j<nc;j++){
                
                if(i==j){
                	ans[j][i] = A[i][j];
                    break;
                }
                ans[j][i] = A[i][j];
                
                
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{5},{8}};
		int ans[][] = transpose(a);
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.println("mat rix-->> "+ ans[i][j]);
			}
		}
	}

}
