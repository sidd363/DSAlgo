package stacks;

public class rainWaterTrapping {
    public static int trap(int[] height) {
        int ans = 0;
        //0,1,0,2,1,0,1,3,2,1,2,1
        //0 1 1 2 2 2 2 3 2 2 2 1
        //0 0 1 0 1 2 1 0 0 1 0 0
        //6

        // ip
       // 4,2,0,3,2,5
       // 4 4 4 4 4 5
       // 5 5 5 5 5 5
        // 4 4 4 4 4 4
        // 0 2 4 1 2 == 9
        int [] greaterElementThanCurrentFromLeft = new int[height.length];
        int [] greaterElementThanCurrentFromRight = new int[height.length];
        greaterElementThanCurrentFromLeft[0] = height[0];

        for(int i = 1; i<height.length ;i++ ){
            if( height[i]>greaterElementThanCurrentFromLeft[i-1]){
                greaterElementThanCurrentFromLeft[i] = height[i];
            }else{
                greaterElementThanCurrentFromLeft[i] = greaterElementThanCurrentFromLeft[i-1];
            }
        }

        greaterElementThanCurrentFromRight[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0; i--){
            if( height[i]>greaterElementThanCurrentFromRight[i+1]){
                greaterElementThanCurrentFromRight[i] = height[i];
            }else{
                greaterElementThanCurrentFromRight[i] = greaterElementThanCurrentFromRight[i+1];
            }
        }

        for(int i = 0; i<height.length ;i++ ){
            // now we will find min for each buildings from their respective left or right
            // max then we need to subtract height of building from the min greatest height obtained from left and right
            // then sum for each
            greaterElementThanCurrentFromLeft[i] = Math.min(greaterElementThanCurrentFromLeft[i],greaterElementThanCurrentFromRight[i] );
            ans+= greaterElementThanCurrentFromLeft[i] -  height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(" total water trapped is -->"+ trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
