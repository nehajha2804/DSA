public class balancedBinaryTree{
    public static void main(String args[]){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(9);
        root.left.left = new TreeNode(7);
        root.left.left.left = new TreeNode(0);
        root.right.right = new TreeNode(12);
        root.left.right = new TreeNode(11);

        System.out.println(isBalanced(root));
      
    }

    private static int height(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);
        return 1+ Math.max(left,right);
    }

    private static boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }

        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(left-right)>1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }
    
}

class TreeNode{
    int val; 
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}