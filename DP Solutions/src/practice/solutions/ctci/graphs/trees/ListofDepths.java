package practice.solutions.ctci.graphs.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListofDepths {
    public List<Queue<Integer>> getListOfDepths(TreeNode root){
        List<Queue<Integer>> sol = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            Queue<Integer> currentLevel = new LinkedList<>();
            for( int i = 0; i < n; i++){
                currentLevel.offer(queue.poll().value);
                if (root.left !=null){
                    queue.offer(root.left);
                }
                if (root.right !=null){
                    queue.offer(root.right);
                }
            }
            sol.add(currentLevel);
        }
        return sol;
    }
}
