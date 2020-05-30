package twoPointers;
import java.util.*;

public class totalFruits {
    public static int totalFruit(int[] tree) {
//    	Map<Integer, Integer> count = new HashMap<>();
//        int i = 0, j;
//        for (j = 0; j < tree.length; ++j) {
//            count.put(tree[j], count.getOrDefault(tree[j], 0) + 1);
//            if (count.size() > 2) {
//                count.put(tree[i], count.get(tree[i]) - 1);
//                count.remove(tree[i++]);
//            }
//            System.out.println(" hash map "+ count + " i "+i);
//        }
//        System.out.println(" hash map "+ j + " i "+i);
//        return j - i;
    	
    	//aliter
    	
    	int res = 0, cur = 0, curb=0;
    	int a = 0, b=0;
    	for(int c : tree) {
    		if(c==b) {
    			
    			
    			curb++;
    			cur++;
    		}else if(c==a) {
    			curb=1;
    			cur++;
    			a = b ;
    			b= c;
    		}else if(c!=a && c!=b) {
    			cur = curb+1;
    			curb = 1;
    			a = b ;
    			b= c;
    		}
    		res = Math.max(res,cur);
    	}
    	return res;
//    	int res = 0, cur = 0, count_b = 0, a = 0, b = 0;
//        for (int c :  tree) {
//            cur = c == a || c == b ? cur + 1 : count_b + 1;
//            count_b = c == b ? count_b + 1 : 1;
//            if (b != c) {a = b; b = c;}
//            res = Math.max(res, cur);
//        }
//        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[3,3,3,1,2,1,1,2,3,3,4]  [0,1,6,6,4,4,6]  [5,0,0,7,0,7,2,7]  [1,1,6,5,6,6,1,1,1,1]
		System.out.println(" total fruit -->> "+totalFruit(new int[] {0, 0,1, 1 }));
	}

}
