/*Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//https://leetcode.com/problems/linked-list-cycle/

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast =head;
        ListNode slow =head;
        while(fast!=null&&fast.next!=null)
        {   fast=fast.next.next;
          slow=slow.next;
            if(fast==slow)
            {
                   return true;
            }
        }
        return false;
    }
}


//length of the cycle


public int lenCycle(ListNode head) {
        ListNode fast =head;
        ListNode slow =head;
        while(fast!=null&&fast.next!=null)
        {   fast=fast.next.next;
          slow=slow.next;
            int cnt=0;
            if(fast==slow)
            {
                   ListNode temp=slow;
                do{
                    temp=temp.next;
                    cnt++;
                }while(temp!=slow);
                return cnt;
            }
        }
        return 0;
    }
