package assignment9.problem1;

public class ArrayQueueImpl {

    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {

        //implement

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {

//implement
        if (rear == arr.length) {
            resize();
        }
        arr[rear++] = obj;
        if (front == -1) {
            front = 0;
        }


    }


    public int dequeue() {

//implement

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedItem = arr[front];
        arr[front++] = 0;
        if (front == rear) {
            front = -1;
            rear = 0;
        }
        return removedItem;
    }

    public boolean isEmpty() {
//implement
        return front == -1;
    }

    public int size() {
//implement
        if (isEmpty()) {
            return 0;
        }
        return rear - front;
    }

    private void resize() {
//implement
        System.out.println("resizing....");
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }
}