package neet150.trees;

import bt.MaxDepth;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        if (root == null)
            return 0;

        Queue<TreeNode> list = new LinkedList<>();
        list.add(root);
        list.add(null);

        while (!list.isEmpty()) {
            TreeNode node = list.poll();

            if (node == null) {
                maxDepth++;
                if (!list.isEmpty())
                    list.add(null);
            } else {
                if (node.left != null)
                    list.add(node.left);
                if (node.right != null)
                    list.add(node.right);
            }
        }

        return maxDepth;
    }

    public int maxDepth_rec(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int left = maxDepth_rec(root.left);
        int right = maxDepth_rec(root.right);

        int maxHeight = Math.max(left, right);
        return maxHeight + 1;
    }

}
