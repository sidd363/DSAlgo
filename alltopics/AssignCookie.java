import java.util.*;

class AssignCookie{

/*
	 Assume you are an awesome parent and want to give your children some cookies.


  But, you should give each child at most one cookie. Each child i has a greed factor gi,

   which is the minimum size of a cookie that the child will be content with;
   and each cookie j has a size sj. If sj >= gi,
    we can assign the cookie j to the child i,
     and the child i will be content. 
     Your goal is to maximize the number of your content children and output the maximum number.

Note:
You may assume the greed factor is always positive.
You cannot assign more than one cookie to one child.
*/

	public static int findContentChildren(int[] g, int[] s) {
        // sort g and sort s and then traverse from backwards
        Arrays.sort(g);
        Arrays.sort(s);

        int ans =0;
        int l = s.length;
        int c =0;
        for(int i:g){
        	while(l>c && i >s[c]){
        		c++;
        	}
        	if(c>=l){
        		return ans;
        	}else{
        		if(i<=s[c]){
        			//System.out.println(" ans "+ans);
        			ans++;
        		}
        		c++;
        		
        	}
        }

		return ans;
    }


	public static void main(String []args){
		int [] g = {1,2,3};

		int [] s = {1,1};

		
		System.out.println(" no of content childrens "+ findContentChildren(g,s));
	}
}