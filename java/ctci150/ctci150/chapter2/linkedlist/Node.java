package ctci150.chapter2.linkedlist;

/**
 * <p>
 *  Single linked list. Maximize your scope...
 * </p>
 * <p>
 * Copyright &copy Pan
 * </p>
 *
 * @author Henry Pan
 */
public class Node
{
    Node next = null;
    int data;
    
    public Node(int d)
    {
        data = d;
    }
    
    /**
     * Append a node with data d to the end of current linked list.
     * 
     * @param d
     *            data d
     */
    public void appendToTail(int d)
    {
        Node end = new Node(d);
        Node n = this;
        
        // shift to from the head node to the current tail node
        while (n.next != null)
        {
            n = n.next;
        }
        // make the current tail node's next point to the latest end (tail) 
        n.next = end;
    }
    
    /**
     * Delete the first node encountered with data equals to d.
     * 
     * @param head
     *            the head of the linked list
     * @param d
     *            the node which we want to delete
     */
    public Node deleleNode(Node head, int d)
    {
        Node n = head;
        
        // shift the head to next node
        if (n.data == d)
        {
            return head.next;
        }
        
        while (n.next != null)
        {
            if (n.next.data == d)
            {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        
        return head;
    }
}
