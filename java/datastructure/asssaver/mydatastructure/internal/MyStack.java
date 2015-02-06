package asssaver.mydatastructure.internal;

import java.util.Arrays;

/**
 * <p>
 * Internal implementation of my stack.
 * </p>
 * 
 * @author Henry Pan
 * @param <E>
 *            generic type of my stack
 */
public class MyStack<E>
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    /**
     * Constructor of my stack with default capacity
     */
    public MyStack()
    {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Constructor of my stack with a capacity.
     * 
     * @param capacity
     *            the capacity
     */
    public MyStack(int capacity)
    {
        elements = new Object[capacity];
    }

    /**
     * Pushes the element to my stack.
     * 
     * @param e
     *            the element to be pushed into my stack
     */
    public void push(E e)
    {
        ensureCapacity();
        elements[size++] = e;
    }

    /**
     * Returns the element popped from my stack.
     * 
     * @return the element popped from my stack
     */
    public E pop()
    {
        @SuppressWarnings("unchecked")
        E e = (E) elements[--size];
        elements[size] = null; // let gc do the work
        return e;
    }

    /**
     * Returns the element peeped from my stack.
     * 
     * @return the element peeped from my stack
     */
    @SuppressWarnings("unchecked")
    public E peep()
    {
        return (E) elements[--size];
    }

    private void ensureCapacity()
    {
        if (size == elements.length)
        {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }
}
