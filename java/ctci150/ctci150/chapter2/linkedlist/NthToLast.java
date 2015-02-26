package ctci150.chapter2.linkedlist;


/**
 * <p>
 * Return the N th to last node in current linked list.
 * </p>
 * <p>
 * Copyright &copy 2015 Pan
 * </p>
 *
 * @author Henry Pan
 */
public class NthToLast
{
    /**
     * Solution: 
     * 1. Create two pointer nodes n1 and n2
     * 2. Let n2 runs first, when it reach the n-1 th node from begining, let n1 run two.
     * 3. Check for n2.next == null, if yes n1 is n th node to last node, otherwise keep 
     *    increment n1 and n2 until n2.next == null is true.
     */
    public boolean nthToLast()
    {
        //TODO
        return false;
    }
}
