package linkedlist;

import linkedlist.DoublyLinkedList.Node;

import java.util.Iterator;

public class ReverseLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 0; i < 5; i++)
            list.add(new Node("" + i));
        // reverse(list);

        print(list);

    }

    private static void print(DoublyLinkedList list) {
        Iterator<Node> it = list.iterator();
        Node node = null;
        String value = null;
        while (it.hasNext()) {
            node = it.next();
            System.out.println(node.getData());

        }

    }

    private static void reverse(DoublyLinkedList list) {
        //Iterator<Integer> it = list.
        //int value = 0;
        //while(it.hasNext()) {
        //value = it.next();
        //it.
        //}

    }

}
