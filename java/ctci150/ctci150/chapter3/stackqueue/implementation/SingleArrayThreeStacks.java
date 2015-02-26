package ctci150.chapter3.stackqueue.implementation;

/**
 * <p>
 * Use a single array to implement three stacks.
 * The only different between this problem with the problem "Use an array to implement a stack" is:
 * ***we will have one argument called stack number added to each method of regular stack implementation.****
 * </p>
 * <p>
 * Copyright &copy 2015 Pan
 * </p>
 *
 * @author Henry Pan
 */
public class SingleArrayThreeStacks
{
    int STACK_SIZE = 100;
    int[] buffer_array = new int[STACK_SIZE * 3];
    int[] stack_index = {0, 0, 0};
    int index = 0;
    
    public void push(int stackNum, int value)
    {
        index = stackNum * STACK_SIZE + stack_index[stackNum] + 1;
        stack_index[stackNum]++;
        
        buffer_array[index] = value;
    }
    
    public int pop(int stackNum)
    {
        index = stackNum * STACK_SIZE + stack_index[stackNum];
        stack_index[stackNum]--;
        
        int value = buffer_array[index];
        buffer_array[index] = 0;
        
        return value;
    }
    
    public int peek(int stackNum)
    {
        index = stackNum * STACK_SIZE + stack_index[stackNum];
        return buffer_array[index];
    }
}
