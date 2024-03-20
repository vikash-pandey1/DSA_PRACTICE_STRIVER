package Stack_Queue;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class QueueULL {


    Node front = null, rear = null;
    int size = 0;

    boolean isEmpty() {
        return front == null;
    }

    int peek() {
        if (front == null) {
            System.out.println("queue empty");
            return -1;
        }
        return front.data;
    }

    void Enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }

    void Dequeue() {
        if (front == null) {
            System.out.println("queue empty");
        }
        front = front.next;
        size--;
    }

    public static void main(String[] args) {
        QueueULL Q=new QueueULL();
    Q.Enqueue(10);
    Q.Enqueue(20);
    Q.Enqueue(30);
    Q.Enqueue(40);
    Q.Enqueue(50);
    System.out.println("The size of queue before dequeue "+Q.size);
    Q.Dequeue();
    System.out.println("The size of the Queue is "+Q.size);
    System.out.println("The Peek element of the Queue is "+Q.peek());
    }
}
