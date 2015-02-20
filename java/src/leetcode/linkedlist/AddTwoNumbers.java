package leetcode.linkedlist;

public class AddTwoNumbers
{
    //TODO: this code hasn't been tested
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode dummyHead = new ListNode(0);
        // dummyHead references to the head of the new list which is used to store the result linked list.
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null && l2 != null)
        {
            int x = (l1 != null) ? l1.data : 0;
            int y = (l2 != null) ? l2.data : 0;
            int digit = carry + x + y;
            carry = digit / 10;
            curr.next = new ListNode(digit % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
}
