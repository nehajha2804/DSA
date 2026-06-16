class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    //Below costructore is messy to right.
    // TreeNode(int val, TreeNode right, TreeNode left){
    //     this.val=val;
    //     this.left=left;
    //     this.right=right;
    // }

     TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }

}

public class basicTree{
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.print(root.toString());
        
      
    }
}


