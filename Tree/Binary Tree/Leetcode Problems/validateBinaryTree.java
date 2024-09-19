//https://leetcode.com/problems/validate-binary-search-tree/
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helpervalid(root,null,null);
    }
    public boolean helpervalid(TreeNode node,Integer low,Integer high)
    {
        if(node==null)
        {
            return true;
        }
        if(low!=null && node.val<=low)
        {
            return false;
        }
       if(high!=null && node.val>=high)
        {
            return false;
        }
        boolean lefttree=helpervalid(node.left,low,node.val);
        boolean righttree=helpervalid(node.right,node.val,high);
        return lefttree && righttree;
    }
}
