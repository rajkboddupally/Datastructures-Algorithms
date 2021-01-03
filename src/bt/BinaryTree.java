package bt;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }
}

public class BinaryTree {
    Node root;

    void printInorder() {
        printInorder(root);
    }

    /*
        L ROOT R
     */
    private void printInorder(Node node) {
        if (node == null) {

            return;
        }
        printInorder(node.left);
        System.out.print(node.value + " ");
        printInorder(node.right);
    }

    void printPreorder() {
        printPreorder(root);
    }

    /*
        ROOT L R
     */
    private void printPreorder(Node node) {

        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");

        printPreorder(node.left);

        printPreorder(node.right);
    }

    void printPostorder() {
        printPostorder(root);
    }

    /*
        L R ROOT
     */
    private void printPostorder(Node node) {

        if (node == null) {
            return;
        }
        printPostorder(node.left);

        printPostorder(node.right);

        System.out.print(node.value + " ");


    }

    public boolean isPresent(int value) {
        return isPresent(root, value);
    }

    private boolean isPresent(Node node, int value) {

        if (node == null) {
            return false;
        }
        boolean isPresent1 = isPresent(node.left, value);
        System.out.println("Checking for value in " + node.value);
        if (value == node.value) {
            return true;
        }
        if(isPresent1) return true;
        boolean isPresent2 = isPresent(node.right, value);
        return isPresent2;
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        /*
        System.out.println("printInorder traversal of binary tree is ");
        tree.printInorder();
        System.out.println();
        System.out.println("printPreorder traversal of binary tree is ");
        tree.printPreorder();
        System.out.println();
        System.out.println("printPostorder traversal of binary tree is ");
        tree.printPostorder();
        */

        System.out.println(tree.isPresent(3));
    }
}
