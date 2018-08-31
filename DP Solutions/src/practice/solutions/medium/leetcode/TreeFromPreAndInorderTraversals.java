package practice.solutions.medium.leetcode;

import practice.solutions.easy.leetcode.TreeNode;

/*Leetcode 105*/

public class TreeFromPreAndInorderTraversals {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(0, 0, inorder.length-1, preorder, inorder);
    }
    public TreeNode buildTreeHelper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(preStart > preorder.length-1 || inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = 0;
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == root.val){
                inIndex = i;
                break;
            }
        }
        root.left = buildTreeHelper(preStart+1, inStart, inIndex - 1, preorder, inorder);
        root.right = buildTreeHelper(preStart+inIndex-inStart+1, inIndex+1, inEnd, preorder, inorder);
        return root;
    }
}
