public class DoublyLL {
    private Node head;
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val)
         {
            this.val=val; 
         }
        public Node(int val,Node next,Node prev)
         {
            this.val=val; 
            this.next=next; 
            this.prev=prev; 
         }
    }
    //Insert at the beginning 
    public void insertF(int val)
    {
        Node node= new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null) {
        head.prev=node;}
        head=node;
    }
    public void insertL(int val)
    {
        Node node= new Node(val);
        //edge case if list is empty
        node.next=null;
        if(head==null) {
         node.prev=null;
         head=node;
         return;
        }
        
        Node last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        
        
    }

    //Display function
    public void display()
    {
        Node node=head;
        Node last=null;
        while(node!=null) {
            System.out.print(node.val+"->");
            last=node;
            node=node.next;
    }
    System.out.println("END");
    
    System.out.println("Dispalying list in reverse order");
    while(last!=null)
    {
     
        //System.out.println("Dispalying list in reverse order");
        System.out.print(last.val+"->");
        last=last.prev;
    }
    System.out.println("START");

    }
    
    public static void main(String[] args)
    {
        DoublyLL list = new DoublyLL();
        list.insertF(3);
        list.insertF(2);
        list.insertF(8);
        list.display();
        list.insertF(17);
        list.display();
        list.insertL(18);
        list.display();
}
}
