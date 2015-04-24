package leetcode.tree;

/**
 * <p>
 * Leetcode question: Minimum Depth of Binary Tree
 * </p>
 * <p>
 * Copyright &copy 2015 Pan
 * </p>
 * 
 * @author Henry Pan
 */
public class MinDepth
{
    /**
     * The recursion method to calcuate the min depth of a tree
     * 
     * @param root
     * @return the min depth of the tree
     */
    public int minDepth(TreeNode root)
    {
        if (root == null)
            return 0;
        if (root.left == null)
            return minDepth(root.right) + 1;
        if (root.right == null)
            return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
