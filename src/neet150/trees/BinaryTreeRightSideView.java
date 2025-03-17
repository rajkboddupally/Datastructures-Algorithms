package neet150.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode node = null;
            for (int i = 0; i < size; i++) {
                node = queue.poll();
                //System.out.println(node.val);

                assert node != null;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);

            }
            res.add(node.val);
        }
        return res;
    }

    public List<Integer> rightSideView_R(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        rightSideView_R(root, 0, res);
        return res;

    }

    private void rightSideView_R(TreeNode node, int level, List<Integer> res) {
        if (node == null) return;

        if (level == res.size()) res.add(node.val);

        rightSideView_R(node.right, level + 1, res);
        rightSideView_R(node.left, level + 1, res);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        //root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        //root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(4);
        BinaryTreeRightSideView b = new BinaryTreeRightSideView();
        List<Integer> res = b.rightSideView(root);
        res.forEach(num -> System.out.print(num + " "));
    }
}
