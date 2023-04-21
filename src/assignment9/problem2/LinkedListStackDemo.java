package assignment9.problem2;

public class LinkedListStackDemo {
    public static void main(String[] args) {
        LinkedListStack stk = new LinkedListStack();
        Object item;
        stk.push('A');
        stk.push('B');
        stk.push('C');
        stk.push('D');

        System.out.println("size(): " + stk.size());
        item = stk.pop();
        System.out.println(item + " is deleted");
        stk.push('D');
        stk.push('E');
        System.out.println(stk.pop() + " is deleted");
        stk.push('G');
        item = stk.peek();
        System.out.println(item + " is on top of stack");
        System.out.println("Size of the Stack : " + stk.size());
        LinkedListStack stk1 = new LinkedListStack();
        stk1.push("Java");
        stk1.push(20);
        stk1.push(30);
    }
}
