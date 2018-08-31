package practice.solutions.easy.leetcode;

/**
 * @author https://github.com/shinigami1392 [Pushkar Ladhe]
 *
 *
 */
public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else{
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            if(lDepth > rDepth){
               return lDepth+1;
            }
            else{
               return rDepth+1;
            }
        }
    }
}
