package assignment9.problem2;


interface Stack {
    public void push(Object item);
    public Object pop();
    public Object peek();
    public boolean isEmpty();
    public int size();
}

class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}


    class LinkedListStack implements Stack {
        private Node top;
        private int size;

        public LinkedListStack() {
            top = null;
            size = 0;
        }

        public void push(Object item) {
            Node newNode = new Node(item);
            newNode.next = top;
            top = newNode;
            size++;
        }

        public Object pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return null;
            }
            Object item = top.data;
            top = top.next;
            size--;
            return item;
        }

        public Object peek() {
            if (isEmpty())
                return null;
            return top.data;
        }

        public boolean isEmpty() {
            return (top == null);
        }

        public int size() {
            return size;
        }
    }

