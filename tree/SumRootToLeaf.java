package tree;

public class SumRootToLeaf {
    public static class Node{
        int val;
        Node left, right;
        public Node(){

        }
        public Node (int k){
            val = k;
            left = null;
            right = null;
        }
    }
    public static int sum(Node root){
//          1
//       2           3
//            4
       // util(root, "", new )
        return 0;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        int ans = sum(root);
        System.out.println(" root to leaf path sum "+ ans);
    }
}
