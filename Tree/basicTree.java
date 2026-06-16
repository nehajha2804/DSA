public class basicTree{
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);

        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);

      

    }

     public static void inOrder(TreeNode root){
        //left root right
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    
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



