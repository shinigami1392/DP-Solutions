package practice.solutions.ctci.graphs.trees;

public class MinimalTree {
    public void createMinimalTree(TreeNode root,int[] arr, int L, int R){
        if(L>R){
            return;
        }
        int mid = (L+R)/2;
        root = new TreeNode(arr[mid]);
        createMinimalTree(root.left, arr, L, mid-1);
        createMinimalTree(root.right, arr, mid+1, R);
    }
}
