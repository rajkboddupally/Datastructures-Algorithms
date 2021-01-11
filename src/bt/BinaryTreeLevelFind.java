package bt;

public class BinaryTreeLevelFind {


    public void print(TreeNode root) {
        int height = getHeight(root);
        System.out.println("Tree height " + height);

        for (int i = 1; i <= height; i++) {
            print(root, i);
        }
    }

    private void print(TreeNode node, int i) {
        if (node == null)
            return;
        if (i == 1)
            System.out.print(node.val + " ");
        else
            print(node.left, i - 1);
        print(node.right, i - 1);
    }

    private int getHeight(TreeNode node) {
        if (node == null)
            return 0;

        int lHeight = getHeight(node.left);
        int rHeight = getHeight(node.right);

        if (lHeight > rHeight)
            return lHeight + 1;
        else
            return rHeight + 1;
    }
}
