package tree;

public class MaxPathSum {
    static class Response{
        int res;
        public Response(int res){
            this.res = res;
        }

        public int getRes() {
            return res;
        }
        public void setRes(int val) {
            this.res = val;
        }
    }
    public static int maxPathSum(NodesAtDistanceK.TreeNode root) {
            Response response = new Response(Integer.MIN_VALUE);
            //response.setRes(Math.max(response.getRes(),  ));
        util(root, response);
            return response.getRes();
    }

    private static int util(NodesAtDistanceK.TreeNode root, Response response) {
        if(root == null){
            return 0;
        }

        int lval = Math.max(0, util(root.left, response));
        int rval = Math.max(0,util(root.right, response));


        response.setRes(Math.max(response.getRes(), root.val + lval+rval));


        return root.val + Math.max(lval, rval);


    }

    public static void main(String[] args) {


        NodesAtDistanceK.TreeNode root = new NodesAtDistanceK.TreeNode(-2);

        root.left = new NodesAtDistanceK.TreeNode(-3);
//        root.right = new NodesAtDistanceK.TreeNode(20);
//
//        root.right.left = new NodesAtDistanceK.TreeNode(15);
//        root.right.right = new NodesAtDistanceK.TreeNode(7);
//        root.right.right.left = new NodesAtDistanceK.TreeNode(100);
//        root.right.right.right = new NodesAtDistanceK.TreeNode(-90);

        System.out.println("beefore");

        //System.out.println("nodes at k distance are --> " + distanceK(root, 1, 1 ));
        int rootAns = maxPathSum(root);

        System.out.println("AFTERRRRRRRR" +  rootAns);

    }

}
