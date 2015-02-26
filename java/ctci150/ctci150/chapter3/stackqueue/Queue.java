package ctci150.chapter3.stackqueue;

import ctci150.chapter2.linkedlist.Node;

public interface Queue
{
    public void enqueue(int data);
    
    public Node dequeue();
}
