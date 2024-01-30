package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = null;
    }
    Node(int data){
        this.data = data;
    }
}

public class Delete_LL {
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node arrToLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node deleteHead(Node head){
        if(head==null) return head;
        head = head.next;
        return head;
    }
    public static Node deleteTail(Node head){
        if(head == null) return null;
        if(head.next ==null) return null;
        Node temp = head;
        while(temp.next.next!=null) temp = temp.next;
        temp.next  = null;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {3,53,3,36,4};
        Node head = arrToLL(arr);
        System.out.println(head.data);
        print(head);
        System.out.println();
        head = deleteHead(head);
        print(head);
        System.out.println();
        head = deleteTail(head);
        print(head);

    }
}
