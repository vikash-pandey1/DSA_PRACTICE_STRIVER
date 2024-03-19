package Stack_Queue;

import java.util.Stack;

class queue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        if (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        if (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        if (s1.isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return s1.pop();
    }

    public int top() {
        if (s1.isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return s1.peek();
    }

    public int size() {
        return s1.size();
    }
}

public class QueueUStack {
    public static void main(String[] args) {
        queue q = new queue();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.top());
        System.out.println("The size of the queue is " + q.size());
    }
}
