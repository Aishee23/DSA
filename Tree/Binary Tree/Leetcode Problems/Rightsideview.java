//https://leetcode.com/problems/binary-tree-right-side-view/description/

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result= new ArrayList<>();
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
                if(i==levelsize-1)
                {
                    result.add(currentNode.val);
                }
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
           
        }
        return result;
            }
    }
