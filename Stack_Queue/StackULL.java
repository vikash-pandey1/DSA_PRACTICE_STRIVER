package Stack_Queue;

public class StackULL {
    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;
    int size;

    StackULL() {
        this.top = null;
        this.size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (top == null)
            return -1;
        int ans = top.data;
        top = top.next;
        return ans;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }
    public void print(){
        while (top!=null) {
            System.out.print(top.data+" ");
            top = top.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackULL s = new StackULL();
    s.push(10);
    s.push(20);
    s.print();
    System.out.println("Element popped " + s.pop());
    System.out.println("Stack size: " + s.size());
    System.out.println("Stack is empty or not: " + s.isEmpty());
    }
}
