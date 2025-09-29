package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseOddLevel {

    // * Definition for a binary tree node.
//  public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
    public static NodesAtDistanceK.TreeNode reverseOddLevels(NodesAtDistanceK.TreeNode root) {
        Stack<NodesAtDistanceK.TreeNode> st = new Stack<>();
        Queue<NodesAtDistanceK.TreeNode> q = new LinkedList<>();

        q.add(root);
        boolean isOdd = false;

        while(!q.isEmpty()){
            int s = q.size();
            while(s>0){
                NodesAtDistanceK.TreeNode  tmp = q.poll();
                boolean already = false;
                if(tmp.left!= null)
                {
                    q.add(tmp.left);

                    if(!isOdd){
                        st.push(tmp.left);
                    }
                }

                if(tmp.right!= null)
                {
                    q.add(tmp.right);

                    if(!isOdd){
                        st.push(tmp.right);
                    }
                }
                if(isOdd) {
                    tmp.val = st.pop().val;
                }
                s--;

            }

            isOdd = !isOdd;

        }

        return root;
    }
    public static void main(String[] args) {
        NodesAtDistanceK.TreeNode root = new NodesAtDistanceK.TreeNode(1);

        root.left = new NodesAtDistanceK.TreeNode(2);
        root.right = new NodesAtDistanceK.TreeNode(3);

        root.left.left = new NodesAtDistanceK.TreeNode(4);
        root.left.right = new NodesAtDistanceK.TreeNode(5);
        root.right.left = new NodesAtDistanceK.TreeNode(6);
        root.right.right = new NodesAtDistanceK.TreeNode(7);

        System.out.println("beefore");
        printTree(root);

        //System.out.println("nodes at k distance are --> " + distanceK(root, 1, 1 ));
        NodesAtDistanceK.TreeNode rootAns = reverseOddLevels(root);

        System.out.println("AFTERRRRRRRR");

        printTree(rootAns);

    }
    public  static void printTree(NodesAtDistanceK.TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);

    }
}
