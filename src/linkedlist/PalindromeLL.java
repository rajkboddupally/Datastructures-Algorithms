package linkedlist;

public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
        ListNode reverseHead = null;
        ListNode prev=null;
        ListNode next;
        ListNode curr=head;
        ListNode temp=head;
        ListNode tempPrev=null;
        while(temp!=null){
            ListNode ln = new ListNode(temp.val);
            if(tempPrev != null)
                tempPrev.next = ln;
            else
                reverseHead = ln;
            tempPrev = ln;
            temp = temp.next;
        }
        while(curr !=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        while(prev != null){
            if(prev.val != reverseHead.val)
                return false;
            prev = prev.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLL palindromeLL = new PalindromeLL();
        ListNode ln5 = new ListNode(1);
        ListNode ln4 = new ListNode(2, ln5);
        ListNode ln3 = new ListNode(2, ln4);
        ListNode ln2 = new ListNode(1, ln3);
        ListNode ln1 = new ListNode(1, ln2);
        System.out.print(palindromeLL.isPalindrome(ln2));;
    }

}
