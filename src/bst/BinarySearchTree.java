package bst;

/* Raj Kumar Boddupally created on 7/20/2021 inside the package - bst */

public class BinarySearchTree {

    TreeNode root;

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.printTree();
        tree.insert(25);
        System.out.println("*********");
        tree.printTree();
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    /*
    3 cases to handle
    1. If root is null, create a new TreeNode and assign to head
    2. If key < root, then call recursively for root.left
    3. If key > root, then call recursively for root.right
     */
    private TreeNode insertRec(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.val) {
            root.left = insertRec(root.left, key);
        } else if (key > root.val) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public TreeNode search(int key) {
        return search(root, key);
    }

    private TreeNode search(TreeNode root, int key) {
        if (root == null || root.val == key) {
            return root;
        }

        if (key < root.val) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    //Print tree using Inorder travel
    public void printTree() {
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.val + " ");
            inorder(root.right);
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int key) {
            this.val = key;
            this.left = this.right = null;
        }
    }
}
