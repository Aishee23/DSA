//https://leetcode.com/problems/binary-search/
class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,target,0,nums.length-1);
    }
    private int bs(int[] a, int target, int start, int end)
    {
    if(start>end)
       {
        return -1;
       }
       int mid=start+(end-start)/2;
       if(a[mid]==target) 
       return mid;
       if(a[mid]<target)
       {
        return bs(a,target,mid+1,end);
       }else{
        return bs(a,target,start,mid-1);
       }
}
}
    
