//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result =new ArrayList<>();
    if(root==null)
     {
        return result;
     } 
    Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
     boolean reverse=false;
    while(!queue.isEmpty()){
    int levelsize=queue.size();
    List <Integer> currentlevel=new ArrayList<>(levelsize);
    TreeNode currentNode;
     for(int i=0;i<levelsize;i++)
            {
                if(!reverse)
                {
                currentNode=queue.pollFirst();
                currentlevel.add(currentNode.val);
                if(currentNode.left!=null)
                {
                    queue.addLast(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    queue.addLast(currentNode.right);
                }
            }else{
                
                currentNode=queue.pollLast();
                currentlevel.add(currentNode.val);
                if(currentNode.right!=null)
                {
                    queue.addFirst(currentNode.right);
                }
                if(currentNode.left!=null)
                {
                    queue.addFirst(currentNode.left);
                }
            }
            
            }
            result.add(currentlevel);
            reverse=!reverse;
            
    }
    return result;
   }
    
}
