class Solution {
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        
        return kthSmallesth(root, k).val;
        
    }
    public TreeNode kthSmallesth(TreeNode root, int k) {
       
        if(root==null)
        {
            return null;
        }
        TreeNode left=kthSmallesth(root.left,k);
        if(left!=null)
        {
            return left;
        }
        count++;
        if(count==k)
        {
            return root;
        }
        return kthSmallesth(root.right,k);
        
    }
}
