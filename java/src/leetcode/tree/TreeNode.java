package leetcode.tree;

public class TreeNode
{
    public int value;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    private int size = 0;

    public TreeNode(int d)
    {
        value = d;
        size = 1;
    }

    public void setLeftChild(TreeNode left)
    {
        this.left = left;
        if (left != null)
        {
            left.parent = this;
        }
    }

    public void setRightChild(TreeNode right)
    {
        this.right = right;
        if (right != null)
        {
            right.parent = this;
        }
    }
}
