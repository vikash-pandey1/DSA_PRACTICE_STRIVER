package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ReverseLL {
    
    public static Node converArr2LL(int arr[]){
        Node head =new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    public static void print(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head =head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = converArr2LL(arr);
        print(head);
        head = reverse(head);
        print(head);
        Node mid = findMiddle(head);
        print(mid);
        head = reverse(mid);
        print(head);
    }
}
