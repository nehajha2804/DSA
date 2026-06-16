class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, TreeNode right, TreeNode left){
        this.val=val;
        this.left=left;
        this.right=right;
    }

     TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }

}

public class basicTree{
    public static void main(String args[]){
        TreeNode root = new TreeNode (1, new TreeNode(2), new TreeNode(3));
      
    }
}