package neet150.trees;

public class SubtreeofAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;
        if (identical(root, subRoot)) return true;
        return identical(root.left, subRoot) || identical(root.right, subRoot);
    }

    private boolean identical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;
        else if (root == null || subRoot == null)
            return false;
        return root.val == subRoot.val && identical(root.left, subRoot.left) && identical(root.right, subRoot.right);
    }
}
