package LinkedList;

public class Insert_2LL {
    public static class Node {
        int  data;
        Node next;
        Node prev;

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;

        }

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;

        }
    }

    public static Node arrToLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i], null, prev);
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }

    public static Node addHead(Node head, int val) {
        Node newHead = new Node(val, head, null);
        head.prev = newHead;
        return newHead;
    }

    public static Node addTail(Node head, int val) {
        Node newTail = new Node(val);
        if (head == null) {
            return newTail;
        }
        Node move = head;
        while (move.next != null) {
            move = move.next;
        }
        move.next = newTail;
        newTail.prev = move;
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node addKth(Node head, int k, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            return newNode;
        }
        if (k == 1) {
            return addHead(head, val);
        }
        Node curr = head;
        int cnt = 0;
        while (curr != null) {
            cnt++;
            if (cnt == k)
                break;
            curr = curr.next;
        }
        Node back = curr.prev;
        back.next = newNode;
        newNode.prev = back;
        newNode.next = curr;
        curr.prev = newNode;
        return head;

    }

    public static void addNode(Node node, int val) {
        Node back = node.prev;
        Node newNode = new Node(val, node, back);
        back.next = newNode;
        node.prev = newNode;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        Node head = arrToLL(arr);
        print(head);
        head = addHead(head, 10);
        print(head);
        head = addTail(head, 8);
        print(head);
        head = addKth(head, 2, 2);
        print(head);
        addNode(head.next,100);
        print(head);
    }
}
