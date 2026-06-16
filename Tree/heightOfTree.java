public class heightOfTree{
    public static void main(String args[]){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        System.out.println(height(root));

    }

    private static int height(TreeNode root){
        if(root==null){
            return 0;
        }

        return 1+ Math.max(
            height(root.left),
            height(root.right)
        );
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