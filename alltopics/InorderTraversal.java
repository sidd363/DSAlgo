

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { 
		 val = x; 
	     left = null;
	     right =  null;
	 }
}
public class InorderTraversal {
	 public List<Integer> inorderTraversal(TreeNode root) {
	        Stack<TreeNode> st = new Stack<TreeNode>();
	        List<Integer> a = new ArrayList<Integer>();
	        
	        while(true){
	            while(root!=null){
	                st.push(root);
	                root = root.left;  
	            }
	            //pop s and print
	            if(st.size()==0){
	                break;
	            }
	            TreeNode l = st.pop();
	            a.add(l.val);
	            root= root.right;
	        }
	        return a;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
