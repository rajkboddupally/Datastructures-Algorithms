package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedList_IITest {
    RemoveDuplicatesFromSortedList_II removeDuplicatesFromSortedList;
    @BeforeEach
    void setUp() {

        removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList_II();
    }

    @Test
    void deleteDuplicates() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next =new ListNode(3);
        l1.next.next.next.next =new ListNode(4);
        l1.next.next.next.next.next =new ListNode(4);
        l1.next.next.next.next.next.next =new ListNode(5);

        ListNode output = removeDuplicatesFromSortedList.deleteDuplicates(l1);

        while(output != null)
        {
            System.out.print(output.val + " => ");
            output = output.next;
        }
        System.out.println();
    }

    @Test
    void deleteDuplicates1() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(1);
        l1.next.next.next =new ListNode(2);
        l1.next.next.next.next =new ListNode(3);

        ListNode output = removeDuplicatesFromSortedList.deleteDuplicates(l1);

        while(output != null)
        {
            System.out.print(output.val + " => ");
            output = output.next;
        }

        System.out.println();
    }
}