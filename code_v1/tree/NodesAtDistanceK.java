package tree;

import java.util.*;

public class NodesAtDistanceK {
      static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          public TreeNode(int x) {
                val = x;
                left=null;
                right=null;
          }

      }

    public static ArrayList<Integer> reverseLL(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        Stack<Integer>st = new Stack<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            while(size >0){
                TreeNode tmp = q.poll();
                st.push(tmp.val);

                if(tmp.right != null){
                    q.offer(tmp.right);
                }
                if(tmp.left != null){
                    q.offer(tmp.left);
                }
                size--;
            }
        }
        while(!st.empty()){
            ans.add(st.pop());
        }
        return  ans;
    }
    public static int minTimeToBurn(TreeNode root, int target) {
        Queue<TreeNode> q = new LinkedList<>();

        HashMap<TreeNode, TreeNode> hm = new HashMap<>();
        TreeNode targetNode = new TreeNode(0);
        q.add(root);
        hm.put(root, null);

        while(!q.isEmpty()){
            int size = q.size();
            while(size >0){
                TreeNode tmp = q.poll();
                if(tmp.val == target){
                    targetNode = tmp;
                }
                if(tmp.left != null){
                    q.offer(tmp.left);
                    hm.put(tmp.left, tmp);
                }
                if(tmp.right != null){
                    q.offer(tmp.right);
                    hm.put(tmp.right, tmp);
                }
                size--;
            }
        }

        // parent map has been prepared
        //System.out.println("parent map is success fully made" + hm);
        int minTime = 0;
        q.add(targetNode);

        HashSet<TreeNode> visited = new HashSet<>();
        while(!q.isEmpty()){
            int size = q.size();

            while(size >0){
                TreeNode tmp = q.poll();
                visited.add(tmp);

                if(tmp.left != null && !visited.contains(tmp.left)){
                    q.offer(tmp.left);

                }
                if(tmp.right != null && !visited.contains(tmp.right)){
                    q.offer(tmp.right);

                }
                if(hm.get(tmp)!= null && !visited.contains(hm.get(tmp))){
                    q.offer(hm.get(tmp));

                }

                size--;
            }
            minTime++;
        }

        return minTime-1;
    }

    public static ArrayList<Integer> distanceK(TreeNode root, int target, int dist) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        HashMap<TreeNode, TreeNode> hm = new HashMap<>();
        TreeNode targetNode = new TreeNode(0);
        q.add(root);
        hm.put(root, null);

        while(!q.isEmpty()){
            int size = q.size();
            while(size >0){
                TreeNode tmp = q.poll();
                if(tmp.val == target){
                    targetNode = tmp;
                }
                if(tmp.left != null){
                    q.offer(tmp.left);
                    hm.put(tmp.left, tmp);
                }
                if(tmp.right != null){
                    q.offer(tmp.right);
                    hm.put(tmp.right, tmp);
                }
                size--;
            }
        }

        // parent map has been prepared
        System.out.println("parent map is success fully made" + hm);

        q.add(targetNode);

        HashSet<TreeNode> visited = new HashSet<>();
        while(!q.isEmpty()){
            int size = q.size();

            while(size >0){
                TreeNode tmp = q.poll();
                visited.add(tmp);
                if(dist == 0){
                    ans.add(tmp.val);
                }
                if(tmp.left != null && !visited.contains(tmp.left)){
                    q.offer(tmp.left);

                }
                if(tmp.right != null && !visited.contains(tmp.right)){
                    q.offer(tmp.right);

                }
                if(hm.get(tmp)!= null && !visited.contains(hm.get(tmp))){
                    q.offer(hm.get(tmp));

                }

                size--;
            }
            dist--;
        }

        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        //System.out.println("nodes at k distance are --> " + distanceK(root, 1, 1 ));

        System.out.println("min time to burn complete binary tree from given target is  --> " + minTimeToBurn(root, 4));


    }



}
