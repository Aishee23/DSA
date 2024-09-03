class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList < > ();
        queue2=new LinkedList < > ();
    }
    
    
    public void push(int x) {
        queue2.add(x);  // Add the element to queue2

        // Move all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }

        // Swap the references of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        // Remove and return the front of queue1
        return queue1.remove();
    }

    public int top() {
        // Return the front element of queue1 without removing it
        return queue1.peek();
    }

    public boolean empty() {
        // Check if queue1 is empty
        return queue1.isEmpty();
    }
}
