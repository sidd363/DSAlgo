package codejam;

import java.util.Scanner;
import java.util.*;


public class parenting {
	//360 480
	//420 540
	//600 660
	//cjc
	
//	4
//	3
//	360 480
//	420 540
//	600 660
	 
	    int x; 
	    int y; 
	  
	    // Constructor 
	    public parenting(int x, int y) 
	    { 
	        this.x = x; 
	        this.y = y; 
	    } 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int test = 1;
		while(t-- >0) {
			
			int n = sc.nextInt();
			parenting [] activityArr = new parenting[n];
			
			for(int  i =0;i<n;i++) {
				    int x , y;
					 x = sc.nextInt();
					 y = sc.nextInt();
					 activityArr[i]=new parenting(x, y);
				
			}
			compute(activityArr, n, test);
			test++;
		}
		
	}

	private static void compute(parenting[] activityArr, int n, int test) {
		// TODO Auto-generated method stub
	   parenting[] activityArrc =   Arrays.copyOf(activityArr, n);
		  
	   Arrays.sort(activityArr, new Comparator<parenting>() { 
            @Override public int compare(parenting p1, parenting p2) 
            { 
//            	   if(p1.y-p2.y ==0) {
//            		   return p1.x - p2.x; 
//            	   }
            	   return p1.x - p2.x; 
            } 
        }); 
	   
	   
	   int cetime = -1;
	   int jetime = -1;
       
//	   if(activityArr.length==2) {
//		   System.out.println("Case #"+test+": "+sb);
//		   return;
//	   }
	   
	   char [] ch = new char[n];
	   int pt = -1;
	   int dups = 0;
	   //activityArrc
       for (int i = 0; i < n; i++) { 
    	       int st = activityArr[i].x;
    	       if(pt==activityArr[i].y) {
    	    	      dups++;
    	       }else {
    	    	      dups = 0;
    	       }
    	       pt = activityArr[i].y;
    	       int index = 0; 
    	       for(int j=0;j<activityArrc.length;j++) {
    	    	       if(activityArrc[j].x==st && activityArrc[j].y==activityArr[i].y) {
    	    	    	      index = j;
    	    	    	      //System.out.println(" index "+ index);
    	    	    	      break;
    	    	       }
    	       }
    	       if((st <cetime && st <jetime )|| dups>2) {
    	    			System.out.println("Case #"+test+": "+"IMPOSSIBLE");
    	    	        return;
    	       }
    	       
    	       if(st >= cetime) {
    	    	      cetime = activityArr[i].y;
    	    	      ch[index] = 'C';
    	    	      
    	       }else if(st >= jetime) {
    	    	      jetime  = activityArr[i].y;
    	    	      ch[index] = 'J';
    	       } 
       } 
       System.out.println("Case #"+test+": "+new String(ch));
		
	}

}
