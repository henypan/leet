package ctci150.chapter3.stackqueue;

import ctci150.chapter2.linkedlist.Node;


public interface Stack
{
    public Node pop();
    
    public void push(int data);
    
    public Node peek();
}
