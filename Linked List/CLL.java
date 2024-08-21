public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
		    node = node.next;
		}
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args)
    {
        CLL list = new CLL();
        list.insert(3);
        list.insert(2);
        list.insert(8);
        list.insert(17);
        
        list.display();
        list.delete(2);
        list.display();
}
}
