https://leetcode.com/problems/reverse-linked-list-ii/submissions/1366062034/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||left ==right)
        {
            return head;
        }
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode pre=dummy;

        //finding the element just before the start of the sublist to be reversed
        for(int i=0;i<left-1;i++)
        {
            pre=pre.next;
        }
        ListNode curr=pre.next; //start of te sublist
        //reversing the sublist
        for(int i=0;i<right-left;i++)
        {
         ListNode temp=curr.next;
         curr.next=temp.next;
         temp.next=pre.next;
         pre.next=temp;

        }
        return dummy.next;
    }
}
