public class basicTree{
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);

        // System.out.println(root.val);
        // System.out.println(root.left.val);
        // System.out.println(root.right.val);

        // inOrder(root);
        // preOrder(root);
        postOrder(root);


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

    public static void preOrder(TreeNode root){
        //root left right
        if(root == null){
            return;
        }
        
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(TreeNode root){
        //left right root
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");

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



