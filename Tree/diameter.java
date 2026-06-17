public class diameter{
    static int  diameter = 0;
    public static void main(String args[]){
        
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        System.out.println(diameter(root));
    }

    private static int height(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left+right);

        return 1+Math.max(left,right);
    }

    private static int diameter(TreeNode root){
        height(root);
        return diameter;
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