package assignment9.problem1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);


        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());

        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Size: " + queue.size());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Peek: " + queue.peek());
        System.out.println("Size: " + queue.size());
        queue.dequeue();
    }
}
