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
    // print method
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    // arr to ll method
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
    // delete head ll method
    public static Node deleteHead(Node head){
        if(head==null) return head;
        head = head.next;
        return head;
    }
    // delete tail ll method
    public static Node deleteTail(Node head){
        if(head == null) return null;
        if(head.next ==null) return null;
        Node temp = head;
        while(temp.next.next!=null) temp = temp.next;
        temp.next  = null;
        return head;
    }
    // delete specified position
    public static Node deleteK(Node head,int k){
        if(head==null) return head;
        if(k==1){
            head = head.next;
            return head;
        }
        int cnt =0;
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp =temp.next;
        }
        return head;
    }
    // delete particular element
    public static Node deleteNode(Node head,int val ){
        if(head == null) return head;
        if(head.data == val){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.data == val){
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {3,53,3,36,4};
        Node head = arrToLL(arr);
        // System.out.println(head.data);
        print(head);
        System.out.println();
        // head = deleteHead(head);
        // print(head);
        System.out.println();
        // head = deleteTail(head);
        // print(head);
        System.out.println();
        // head = deleteK(head,3);
        // print(head);
        System.out.println();
        head = deleteNode(head,53);
        print(head);
    }
}
