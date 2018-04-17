package practice.solutions.ctci.graphs.trees;

public class ValidareBST {
    boolean isValid(TreeNode root){
        if(root == null){
            return true;
        }
        if(root.left != null && !(root.left.value < root.value)){
            return false;
        }
        else if(root.left != null){
            return isValid(root.left);
        }
        if(root.right != null && !(root.right.value > root.value)){
            return false;
        }
        else if(root.right != null)
        {
            return isValid(root.right);
        }
    }
}
