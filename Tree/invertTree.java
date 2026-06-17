public class invertTree{
    public static void main(String args[]){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        System.out.println(invertTree(root));

    }

    private static TreeNode invertTree(TreeNode root){
        if(root == null) return null;

        TreeNode temp = root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
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