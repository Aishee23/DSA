//https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {   int rowsum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                    rowsum=rowsum+accounts[i][j];
            }
            if (rowsum>ans)
           {
            ans=rowsum;
           }
    }  
    return ans;  
    }
}
