package leetcode.tree;

/**
 * <p>
 * Leetcode question: Maximum Depth of Binary Tree
 * </p>
 * <p>
 * Copyright &copy 2015 Pan
 * </p>
 *
 * @author Henry Pan
 */
public class MaxDepth
{
    /**
     * The recursion method to calcuate the max depth of a tree 
     * 
     * @param root
     * @return the max depth of the tree 
     */
    public int maxDepth(TreeNode root)
    {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
