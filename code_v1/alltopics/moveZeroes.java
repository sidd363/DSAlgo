
public class moveZeroes {
    public static void moveZeroesToEnd(int[] nums) {
        int fz =-1,sz=-1;
        int zc = 0;
        
        for(int i = 0;i< nums.length;i++) {
        	
        	if(nums[i]==0) {
        		zc++;
        		if(zc ==1) {
        			fz =i;
        		}else {
        			sz  = i;
        		}
        	}else {
        		//move ele to fz and increment fz when zc >1 else fz = i
        		if(zc>0) {
        			int tmp = nums[i];
        			nums[fz] = tmp;
        			nums[i] = 0;
        					
        			if(zc>1) {
        				fz++;
        				sz = i;
        			}else {
        				fz = i;
        			}
        		}
        		
        	}
        }
        
        System.out.println(" modified array ");
        for(int i : nums) {
        	System.out.print(i+ " \t");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveZeroesToEnd(new int[] {1, 7, 2, 0,3});
	}

}
