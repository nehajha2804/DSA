class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.value = value;
    }

   
}

public class basicTree{
    public static void main(String args[]){

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.left= new TreeNode(8);
        root.left.right= new TreeNode(6);
        root.right.left= new TreeNode(7);
        root.right.right= new TreeNode(0);

        System.out.println(root.toString());

    }
}

