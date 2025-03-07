package bt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
Level Order Traversal technique is a method to traverse a Tree such that all nodes present in the same level are traversed completely before traversing the next level.


 */
public class LevelOrderTraversal {
    Node root;


    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    // Method to perform Level Order Traversal using two stacks
    public void levelOrderUsingQueue(Node node) {
        if (node == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node currNode = queue.poll();
            System.out.print(currNode.value + " -> ");
            if (currNode.left != null) queue.offer(currNode.left);
            if (currNode.right != null) queue.offer(currNode.right);
        }
    }

            /*
                                                    1
                                                   / \
                                                  2    3
                                                 /\    /\
                                                4  5  6  7
                                                   /
                                                  8

LEVEL ORDER TRAVERSAL :  1 2 3 4 5 6 7 8
             */

    // Method to perform Level Order Traversal using two stacks
    public void levelOrderUsingStack(Node node) {

        if (node == null)
            return;
        int maxHeight = 0;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(node);

        while (!stack1.isEmpty()) {
            Node currNode = stack1.pop();
            System.out.print(currNode.value + " -> ");

            if (currNode.left != null)
                stack2.push(currNode.left);

            if (currNode.right != null)
                stack2.push(currNode.right);

            if (stack1.isEmpty()) {
                Stack<Node> temp = stack1;
                stack1 = stack2;
                stack2 = temp;
                maxHeight++;
            }
        }
        System.out.println();
        System.out.println("maxHeight -> " + maxHeight);

    }

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.right.left = new Node(8);

        //tree.levelOrderUsingQueue(tree.root);
        tree.levelOrderUsingStack(tree.root);


    }
}
