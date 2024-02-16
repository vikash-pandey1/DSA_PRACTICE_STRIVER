package LinkedList;

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Palindrome {
    public static Node converArr2LL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static boolean isPalin(Node head){
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp!=null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            if(temp.data!=stack.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2,1 };
        Node head = converArr2LL(arr);
        print(head);
        System.out.println(isPalin(head));
    }
}
