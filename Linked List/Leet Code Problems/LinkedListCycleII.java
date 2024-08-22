
//https://leetcode.com/problems/linked-list-cycle-ii/description/
//HOW TO APPROACH THE PROBLEM
/*1. We use two pointers, slow and fast, to traverse the linked list. slow moves one step at a time, while fast moves two steps at a time.
2.If there is a cycle, fast will eventually catch up to slow within the cycle.
3.Once slow and fast meet, we reset slow to the head of the list and keep fast at the meeting point.
4.We then move both slow and fast one step at a time. When they meet again, it will be at the starting point of the cycle.
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
