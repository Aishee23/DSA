class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node node=head;
        while(node!=null)
        {
            if(node.data==key)
            {
                return true;
            }
            node=node.next;
        }
        return false;
    }
}
