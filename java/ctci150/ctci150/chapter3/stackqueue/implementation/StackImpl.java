package ctci150.chapter3.stackqueue.implementation;

import ctci150.chapter2.linkedlist.Node;
import ctci150.chapter3.stackqueue.Stack;

public class StackImpl implements Stack 
{
    Node top;
    
    @Override
    public Node pop()
    {
        Node ret = null;
        if (top != null)
        {
            ret = top;
            top = top.next;
        }
        return ret;
    }

    @Override
    public void push(int data)
    {
        Node tmp = new Node(data);
        tmp.next = top;
        top = tmp;
    }

    @Override
    public Node peek()
    {
        return top;
    }

}
