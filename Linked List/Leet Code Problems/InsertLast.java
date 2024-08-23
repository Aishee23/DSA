//https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion

class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node node=new Node(x);
        if(head==null)
        {
            return node;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        
        temp.next=node;
        return head;
    }
}
