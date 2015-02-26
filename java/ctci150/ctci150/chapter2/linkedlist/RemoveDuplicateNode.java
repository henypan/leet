package ctci150.chapter2.linkedlist;

public class RemoveDuplicateNode
{
    void deleteDupWithoutBuffer(LinkedListNode head)
    {
        if (head == null) return;
        LinkedListNode previous = head;
        LinkedListNode current = previous.next;
        
        while (current != null)
        {
            LinkedListNode runner = head;
            while (runner != current)
            {
                if (runner.data == current.data)
                {
                    LinkedListNode temp = current.next;
                    previous.next = temp;
                    current = temp;
                    break;
                }
                runner = runner.next;
            }
            
            if (runner == current)
            {
                previous = current;
                current = current.next;
            }
        }
    }
}
