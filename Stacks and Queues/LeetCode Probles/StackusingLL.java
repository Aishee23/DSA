class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;
void push(int a) {
    // Function to push an integer into the stack.
    StackNode newNode = new StackNode(a);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    // Function to remove an integer from the top of the stack.
    int pop() {
        if (top == null) {
            return -1;
        } else {
            int poppedElement = top.data;
            top = top.next;
            return poppedElement;
        }
    }
    }
