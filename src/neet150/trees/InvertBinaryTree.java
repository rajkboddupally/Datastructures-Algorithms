package neet150.trees;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        if (root.left != null) invert(root.left);
        if (root.right != null) invert(root.right);

        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;

        return root;

    }

    private void invert(TreeNode node) {
        TreeNode left = node.left;

        node.left = node.right;
        node.right = left;

        if (node.left != null) invert(node.left);

        if (node.right != null) invert(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        //root.left.right.left = new TreeNode(8);
        printTree(root);
        System.out.println();
        InvertBinaryTree ib = new InvertBinaryTree();
        ib.invertTree(root);

        printTree(root);
    }

    private static void printTree(TreeNode root) {
        if(root != null) {
            //System.out.print(root.val + " -> ");
            if(root.left != null)
                System.out.print(root.left.val + " -> ");
            if(root.right != null)
                System.out.print(root.right.val + " -> ");
            printTree(root.left);
            printTree(root.right);
        }

    }
}
