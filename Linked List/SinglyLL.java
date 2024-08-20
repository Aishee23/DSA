public class SinglyLL{
    private Node head;
    private Node tail;

    private int size;
    public SinglyLL()
    {
        this.size=0;
    }

    //creation of a node
    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    //function to insert at first position
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    } 
    //display function
     
    public void display(){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.value +"->");
            temp=temp.next;
    }
    System.out.println("END");
}

//function to enter Last position

public void insertLast(int val) {
    Node node = new Node(val);
    tail.next = node;
    tail=node;

    if (tail == null) {
        insertFirst(val);
        return;
    }
    size += 1;
} 
//function to insert at any position
public void insert(int val,int index) {
if(index==0)
{
    insertFirst(val);
    return;
}
if(index==size)
{
    insertLast(val);
    return;
}
Node temp=head;
for(int i =1;i<index;i++) //to move the index across the list
{
    temp=temp.next;
}
    Node node = new Node(val,temp.next);
    temp.next = node;
    size ++;
} 

    public Node get(int index) {
    Node node = head;
    for (int i = 0; i < index; i++) {
        node = node.next;
    }
    return node;
}

public int deleteFirst() {
    int val = head.value;
    head = head.next;
    if (head == null) {
        tail = null;
    }
    size--;
    return val;
}
public int deleteLast() {
    if (size <= 1) {
        return deleteFirst();
    }

    Node secondLast = get(size - 2);
    int val = tail.value;
    tail = secondLast;
    tail.next = null;
    size--;
    return val;
}

public int delete(int index) {
    if (index == 0) {
        return deleteFirst();
    }
    if (index == size - 1) {
        return deleteLast();
    }

    Node prev = get(index - 1);
    int val = prev.next.value;

    prev.next = prev.next.next;
    size--;
    return val;
}
//finding the indesx of a value in the linked list
public Node find(int val) {
    Node node = head;
    
    while(node != null) {
        if(node.value ==val)
        {
            return node;
        }
        node=node.next;
}
return null;
}

public static void main(String[] args)
    {
        SinglyLL list = new SinglyLL();
        list.insertFirst(5);
        list.insertFirst(78);
        list.insertFirst(8);
        list.insertFirst(98);
        list.display();
        list.insertLast(17);
        list.display();
        list.insert(100, 3);
        list.display();
        list.delete(2);
        list.display();
        list.find(100);
}
}
