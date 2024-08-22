//https://leetcode.com/problems/happy-number/description/
/*Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false*/

class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
           slow=findSquare(slow);
           fast=findSquare(findSquare(fast));
        }while(fast!=slow);
        if(slow==1)
        {
            return true;
        }return false;
    }
    private int findSquare(int num)
    {
        int ans=0;
        while(num>0){
            int rem =num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}
