package asssaver.mydatastructure.internal;

import java.util.Arrays;

/**
 * <p>
 * Internal implementation of ArrayList structure
 * </p>
 * 
 * @author Henry Pan
 * @param <E>
 *            E type
 */
public class MyList<E>
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private Object elements[];

    /**
     * The constructor of {@link MyList}.
     */
    public MyList()
    {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * The add method of my list.
     * 
     * @param e
     *            the element to be added to my list
     */
    public void add(E e)
    {
        if (size == elements.length)
        {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    /**
     * The get method of my list.
     * 
     * @param i
     *            the index used to retrieve the element from my list
     * @return the retrieved element
     */
    @SuppressWarnings("unchecked")
    public E get(int i)
    {
        if (i >= size || i < 0)
        {
            throw new IndexOutOfBoundsException("Index: " + i + ", size: " + size); //$NON-NLS-1$ //$NON-NLS-2$
        }

        return (E) elements[i];
    }

    /**
     * Returns the size of my list.
     * 
     * @return the size of my list
     */
    public int size()
    {
        return size;
    }

    private void ensureCapacity()
    {
        int newSize = elements.length + (int)(DEFAULT_CAPACITY * LOAD_FACTOR);
        elements = Arrays.copyOf(elements, newSize);
    }
}
