//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums,0,nums.length-1);
        
    }
    private TreeNode sortedArrayToBST(int[]nums,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=(start+end)/2;
  //this.insert(nums[mid]);
 TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, start, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, end);
        return node;
    }
}
