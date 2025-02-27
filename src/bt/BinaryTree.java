package bt;

import java.util.Stack;

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
        System.out.print(node.value + " -> ");
        printInorder(node.right);
    }

    /*
                                                   1
                                                  / \
                                                 2    3
                                                /\    /\
                                               4  5  6  7
                                                  /
                                                 8

   INORDER :    LEFT  ROOT   RIGHT     -   4 2 8 5 1 6 3 7

   STACK flow
   PUSH 1 -> PUSH 2 -> PUSH 4 -> POP 4 -> POP 2 -> PUSH 5 -> PUSH 8 -> POP 8 -> POP 5 ->  POP 1 -> PUSH 3 -> PUSH 6 -> POP 6 -> POP 3 -> PUSH 7 -> POP 7

   4 2 8 5 1 6 3 7

        */
    private void printInorderIteratively() {
        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.print(curr.value + " -> ");
            curr = curr.right;
        }
    }

    void printPreorder() {
        printPreorder(root);
    }

    /*
        ROOT -> LEFT SUBTREE ->  RIGHT SUBTREE
     */
    private void printPreorder(Node node) {

        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");

        printPreorder(node.left);

        printPreorder(node.right);
    }

    private void printPreOrderIteratively() {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.value + " ");
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
    }

    /*
    Left subtree
    Right subtree
    Root node
     */

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

        System.out.print(node.value + " -> ");
    }

    private void printPostorderIteratively() {
        if (root == null)
            return;

        Stack<Node> stack1 = new Stack<>();
        stack1.push(root);

        Stack<Node> stack2 = new Stack<>();

        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            stack2.push(node);

            if (node.left != null)
                stack1.push(node.left);
            if (node.right != null)
                stack1.push(node.right);
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().value + " -> ");
        }

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
        if (isPresent1) return true;
        boolean isPresent2 = isPresent(node.right, value);
        return isPresent2;
    }

        /*
                                                    1
                                                   / \
                                                  2    3
                                                 /\    /\
                                                4  5  6  7
                                                   /
                                                  8

    PREORDER :   ROOT  LEFT   RIGHT     -   1 2 4 5 8 3 6 7

    POSTORDER :  LEFT  RIGHT  ROOT      -   4 8 5 2 6 7 3 1

    INORDER :    LEFT  ROOT   RIGHT     -   4 2 8 5 1 6 3 7

         */


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.right.left = new Node(8);


        System.out.println("RECURSSIVE - printInorder traversal of binary tree is ");
        tree.printInorder();
        System.out.println();

        System.out.println("ITERATIVE - printInorder traversal of binary tree is ");
        tree.printInorderIteratively();
        System.out.println();

        /*
        System.out.println("RECURSSIVE - printPreorder traversal of binary tree is ");
        tree.printPreorder();


        System.out.println();
        System.out.println("ITERATIVE - printPreorder traversal of binary tree is ");
        tree.printPreOrderIteratively();

        System.out.println();
        System.out.println("RECURSSIVE - printPostorder traversal of binary tree is ");
        tree.printPostorder();

        System.out.println();
        System.out.println("ITERATIVE - printPostorder traversal of binary tree is ");
        tree.printPostorderIteratively();

        System.out.println(tree.isPresent(3));
         */
    }
}
