package leetcode.tree;

/**
 * <p>
 * Leetcode question: validate binary tree
 * </p>
 * <p>
 * Copyright &copy 2015 Pan
 * </p>
 *
 * @author Henry Pan
 */
public class ValidateBST
{
    
    /**
     * This is the brutal force method, it will check every layer of the BT.
     * @param root
     * @return {@code true} if it is a valid BST, else return false
     */
    public boolean isValidBST1(TreeNode root)
    {
        if (root == null)
            return true;
        return isSubtreeGreaterThan(root.right, root.value)
                && isSubtreeLessThan(root.left, root.value) && isValidBST1(root.left)
                && isValidBST1(root.right);
    }
    
    private boolean isSubtreeLessThan(TreeNode treeNode, int val)
    {
        //TODO - you have to put the implementation here
        return false;
    }
    
    private boolean isSubtreeGreaterThan(TreeNode treeNode, int val)
    {
        //TODO - you have to put the implementation here
        return false;
    }
}
