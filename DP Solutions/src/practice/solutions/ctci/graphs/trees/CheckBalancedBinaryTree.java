package practice.solutions.ctci.graphs.trees;

public class CheckBalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int min = calcMinHeight(root);
        int max = calcMaxHeight(root);
        if((max-min)>1){
            return false;
        }
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        return left && right;
    }

    public int calcMinHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.min(calcMinHeight(root.left),calcMinHeight(root.right));
    }

    public int calcMaxHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(calcMaxHeight(root.left),calcMaxHeight(root.right));
    }
}
