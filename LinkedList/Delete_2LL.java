package LinkedList;

import LinkedList.Delete_2LL.Node;

public class Delete_2LL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node arrTo2LL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], prev, null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;
        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.prev;
        tail.prev = null;
        prev.next = null;
        return head;
    }

    public static Node deleteKth(Node head, int k) {
        if (head == null || head.next == null)
            return null;
        Node curr = head;
        int cnt = 0;
        while (curr != null) {
            cnt++;
            if (curr.data == k)
                break;
            curr = curr.next;
        }
        Node back = curr.prev;
        Node front = curr.next;
        if(front== null && back == null){
            return null;
        }else if(back == null){
            return deleteHead(head);
        }else if(front == null){
            return deleteTail(head);
        }else{
            back.next  = front;
            front.prev  = back;
            curr.next = null; 
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        Node head = arrTo2LL(arr);
        print(head);
        head = deleteHead(head);
        print(head);
        head = deleteTail(head);
        print(head);
        head = deleteKth(head,6);
        print(head);
    }
}
