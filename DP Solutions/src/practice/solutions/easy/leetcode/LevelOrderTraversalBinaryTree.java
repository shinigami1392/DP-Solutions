package practice.solutions.easy.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class LevelOrderTraversalBinaryTree {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(12);
		root.left.left = new TreeNode(8);
		//root.left.right = new TreeNode(10);
		root.right = new TreeNode(18);
		root.right.left = new TreeNode(17);
		root.right.right = new TreeNode(19);
		LevelOrderTraversalBinaryTree lt = new LevelOrderTraversalBinaryTree();
		lt.levelOrderTraverse(root);
	}
	
	
	public void levelOrderTraverse(TreeNode root){
		if(root == null){
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> wrapper = new ArrayList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			int level = queue.size();
			TreeNode current = queue.poll();
			List<Integer> thisLevel = new ArrayList<>();
			for(int i = 0; i < level; i++){
				if (queue.peek().left !=null) {
					queue.offer(queue.peek().left);
				}
				if(queue.peek().right !=null){
					queue.offer(queue.peek().right);
				}
				thisLevel.add(queue.poll().val);
			}
			wrapper.add(thisLevel);
//			if(current != null){
//				System.out.println(current.val);
//				queue.add(current.left);
//				queue.add(current.right);
//			}
		}
	}
}
