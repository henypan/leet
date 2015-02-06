package asssaver.mydatastructure.internal.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import asssaver.mydatastructure.internal.MyList;

/**
 * <p>
 * Tests methods of {@link MyList}.
 * </p>
 *
 * @author Henry Pan
 */
public class MyListTest
{
    private MyList<Integer> myList = new MyList<Integer>();

    /**
     * Test methods {@link MyList#add(Object)} and {@link MyList#get(int)}.
     */
    @Test 
    public void testMyList()
    {
        myList.add(111);
        myList.add(222);
        myList.add(333);
        
        assertEquals(new Integer(111), myList.get(0));
        assertEquals(new Integer(222), myList.get(1));
        assertEquals(new Integer(333), myList.get(2));
    }

    /**
     * Test upper bound index out of boundary exception.
     */
    @Test(expected=IndexOutOfBoundsException.class)
    public void testUpperBoundIndex()
    {
        myList.add(101);
        myList.add(102);
        
        myList.get(3);
    }
    
    /**
     * Test lower bound index out of boundary exception.
     */
    @Test(expected=IndexOutOfBoundsException.class)
    public void testLowerBoundIndex()
    {
        myList.add(201);
        myList.add(202);
        
        myList.get(-1);
    }
}
