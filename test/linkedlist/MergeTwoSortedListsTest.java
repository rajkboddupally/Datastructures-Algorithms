package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    MergeTwoSortedLists mergeTwoSortedLists;
    @BeforeEach
    void setUp() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    void mergeTwoLists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next =new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next =new ListNode(4);

        ListNode l3 = mergeTwoSortedLists.mergeTwoLists(l1,l2);

        while(l3 != null)
        {
            System.out.print(l3.val + " => ");
            l3 = l3.next;
        }

    }

    @Test
    void mergeTwoLists1() {
        ListNode l1 = new ListNode();


        ListNode l2 = new ListNode();


        ListNode l3 = mergeTwoSortedLists.mergeTwoLists(l1,l2);

        while(l3 != null)
        {
            System.out.print(l3.val + " => ");
            l3 = l3.next;
        }

    }
}