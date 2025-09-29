

public class dayoFYEAR {

	
	public static int dayOfYear(String date) {
        int ans =0;
        
        String[] a = date.split("-");
        
        String year = a[0]; 
        String mon = a[1]; 
        String day = a[2]; 
        
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(mon);
        int d = Integer.parseInt(day);
        
        boolean leap = false;
        if(y%400==0){
            leap = true;
        }
        int da[]={31,28,31,30, 31, 30, 31, 31, 30,31,30,31};
        
        if(leap){
            da[1]=29;
        }
        
        
        ans+=d;
        for(int i=0;i<m-1;i++){
            ans+=da[i];
        }
        
        
        return ans;
    }
	//4 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(dayOfYear("1900-03-25" + 
       		""));
	}

}
