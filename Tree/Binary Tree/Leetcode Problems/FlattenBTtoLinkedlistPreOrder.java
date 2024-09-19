//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

public void flatten(TreeNode root) {
        if(root==null)
        {
            return;
        }
        TreeNode current=root;
        while(current!=null)
        {
          if(current.left!=null)
          {
            TreeNode temp=current.left;
            while(temp.right!=null)
            {
                temp=temp.right;
            }
            temp.right=current.right;//inserting in the rightmost element in th left sub tree
            current.right=current.left;
            current.left=null;
        }
        current=current.right;
    }
}
