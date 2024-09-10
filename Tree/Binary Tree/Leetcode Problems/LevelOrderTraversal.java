//https://leetcode.com/problems/binary-tree-level-order-traversal/


class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int levelsize=queue.size();
            List<Integer> currentlevel=new ArrayList<>(levelsize);
            for(int i=0;i<levelsize;i++)
            {
                TreeNode currentNode=queue.poll();
                currentlevel.add(currentNode.val);
                if(currentNode.left!=null)
                {
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    queue.add(currentNode.right);
                }
            }
            result.add(currentlevel);
        }
        return result;
    }
}
