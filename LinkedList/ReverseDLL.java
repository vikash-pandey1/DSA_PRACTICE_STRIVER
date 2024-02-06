package LinkedList;

public class ReverseDLL {
    public static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data,Node prev,Node next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node  arrTo2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],prev,null);
            prev.next  = temp;
            prev = temp;
        }
        return head;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node back = null;
        Node curr = head;
        while(curr!=null){
            back = curr.prev;

            curr.prev = curr.next;
            curr.next = back;
            curr = curr.prev;
        }
        return back.prev;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = arrTo2LL(arr);
        print(head);
        head =reverse(head);
        print(head);
    }
}
