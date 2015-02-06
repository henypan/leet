package asssaver.mydatastructure.internal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import asssaver.mydatastructure.internal.MyMap;

/**
 * <p>
 * Tests class {@link MyMap}.
 * </p>
 *
 * @author Henry Pan
 */
public class MyMapTest
{
    /**
     * Tests the methods in {@link MyMap}.
     */
    @SuppressWarnings("nls")
    @Test
    public void testMyMap()
    {
        MyMap<String, Integer> myMap = new MyMap<String, Integer>();
        myMap.put("One", 111);
        myMap.put("Two", 2222);
        myMap.put("Three", 333);
        assertEquals(myMap.get("One"), new Integer(111));
        assertEquals(myMap.size(), 3);
        
        myMap.put("One", 101);
        assertEquals(myMap.get("One"), new Integer(101));
        assertEquals(myMap.size(), 3);
        
        myMap.remove("Two");
        assertNull(myMap.get("Two"));
        assertEquals(myMap.size(), 2);
    }
}
