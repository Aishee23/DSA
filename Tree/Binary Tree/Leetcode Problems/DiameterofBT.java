class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1; //diameter just is giving the number of nodes so edges will be -1
        
    }
    int height(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        int leftheight=height(node.left);
        int rightheight=height(node.right);
        int dia=leftheight+rightheight+1;
        diameter=Math.max(diameter,dia);
        return Math.max(leftheight,rightheight)+1;
    }
}
