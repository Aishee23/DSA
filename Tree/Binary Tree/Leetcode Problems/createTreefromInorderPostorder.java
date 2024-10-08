public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0)
       {
        return null;
       } 
       int r=postorder[postorder.length-1];
       int index =0;

       for(int i=0;i<inorder.length;i++)
       {
        if(inorder[i]==r)
        {
            index=i;
        }
       }
       TreeNode node=new TreeNode(r);

    node.left = buildTree(Arrays.copyOfRange(inorder, 0, index), Arrays.copyOfRange(postorder, 0, index));
    node.right = buildTree(Arrays.copyOfRange(inorder, index + 1, inorder.length), Arrays.copyOfRange(postorder, index, postorder.length - 1));

      return node;
    }
