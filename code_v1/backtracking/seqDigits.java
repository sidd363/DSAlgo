package backtracking;

import java.util.*;

public class seqDigits {
	
    public static List<Integer> sequentialDigits(int low, int high) {
    	List<Integer> ans = new ArrayList<Integer>();
		int [] all = new int[]{ 12,23,34,45,56,67,78,89, 123 ,234, 345 , 456 ,567, 678, 789, 1234, 2345, 3456 ,4567 ,5678, 6789, 12345 ,23456, 34567, 45678 ,56789 ,123456, 234567, 345678, 456789 ,1234567, 2345678, 12345678 , 23456789 ,123456789, };
        for(int i: all){
        	if(i>=low && i<=high){
        		ans.add(i);
			}
		}

    	//bt(ans, low, high, number);
    	
    	return ans;
    }
	public static List<Integer> sequentialDigitsDFS(int low, int high) {
		int MOD=1000000000;
		List<Integer> result=new ArrayList<>();
		if(low<10||high>MOD){
			return result;
		}
		for(int i=1;i<=9;i++){
			backtrace(result,i,0,low,high);
		}
		Collections.sort(result);
		return result;
	}

	public static void backtrace(List<Integer> result,int start,int target,int low,int high){
		if(target>=low&&target<=high){
			result.add(target);
		}
		if(start>9||target>high){
			return;
		}
		backtrace(result,start+1,target*10+start,low,high);
	}

	private static void util(int low, int high, String cur, List<Integer> ans) {

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sequentialDigitsDFS(100, 9000));
		//System.out.println(sequentialDigits(100, 300));
	}

}
