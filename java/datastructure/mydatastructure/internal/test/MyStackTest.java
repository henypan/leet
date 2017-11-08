package mydatastructure.internal.test;

import mydatastructure.internal.MyStack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * <p>
 * Tests methods in {@link MyStack}.
 * </p>
 * 
 * @author Henry Pan
 */
@SuppressWarnings("nls")
public class MyStackTest
{
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopEmptyStack()
    {
        MyStack<String> myStack = new MyStack<String>();
        myStack.pop();
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPeepEmptyStack()
    {
        MyStack<String> myStack = new MyStack<String>();
        myStack.peep();
    }
    
    
    @Test
    public void testMyStack()
    {
        MyStack<String> myStack = new MyStack<String>();
        myStack.push("One");
        myStack.push("Two");
        myStack.push("333");
        
        String result1 = myStack.pop();
        assertEquals("333", result1);
        
        String result2 = myStack.peep();
        assertEquals("Two", result2);
    }
}
