package ctci150.chapter3.stackqueue.implementation;

import ctci150.chapter2.linkedlist.Node;
import ctci150.chapter3.stackqueue.Queue;


/**
 * <p>
 * First in first out.
 * </p>
 * <p>
 * Copyright &copy 2015 Pan
 * </p>
 *
 * @author Henry Pan
 */
public class QueueImpl implements Queue
{
    Node first, last;
    
    @Override
    public void enqueue(int data)
    {
        Node temp = new Node(data);
        if (first != null)
        {
            // temp node will be the next one in line after first node
            temp = first.next;
        }
        else
        {
            temp.next = last;
            last = temp;
        }
    }

    @Override
    public Node dequeue()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
