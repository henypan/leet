package asssaver.mydatastructure.internal.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import asssaver.mydatastructure.internal.MyStack;

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
        System.out.println(result1);
        
        String result2 = myStack.peep();
        assertEquals("Two", result2);
        System.out.println(result2);
    }
}
