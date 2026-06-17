public class noOfNodes{
    public static void main(String args[]){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);

        System.out.println(countNoOfNodes(root));
    }

    private static int countNoOfNodes(TreeNode root){
        if(root==null){
            return 0;
        }

        return 1+ countNoOfNodes(root.left) + countNoOfNodes(root.right);
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }
}