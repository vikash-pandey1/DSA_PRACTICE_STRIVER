package LinkedList;

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

public class FindMiddle {

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

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public static Node findMiddle2(Node head) {
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        int mid = cnt / 2;
        temp = head;
        while (temp != null) {
            if (mid == 0) {
                break;
            }
            mid--;
            temp = temp.next;
            
        }
        return temp;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = converArr2LL(arr);
        print(head);
        // System.out.println(findMiddle2(head));
        Node mid = findMiddle2(head);
        print(mid);
        Node mid1 = findMiddle(head);
        print(mid1);
    }
}
