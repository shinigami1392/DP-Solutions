package practice.solutions.medium.leetcode;

import java.util.ArrayList;
import java.util.List;

import practice.solutions.easy.leetcode.TreeNode;

/*Leetcode 94*/

public class InorderTraversalOfTree {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        traverse(inorder, root);
        return inorder;
    }
    
    public void traverse(List<Integer> inorder, TreeNode root){
        if(root == null){
            return;
        }
        else{
            traverse(inorder, root.left);
            inorder.add(root.val);
            traverse(inorder, root.right);
        }
    }
}
