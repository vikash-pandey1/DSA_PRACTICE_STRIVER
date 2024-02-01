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
    }
}

public class Insertion_LL {
    // arr to LL
    public static Node arrToLL(int arr[]){
        Node head = new Node(arr[0]);
        Node move = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            move.next = temp;
            move = temp;
        }
        return head;
    }
    // print LL
    public static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    // insert at head position
    public static Node insertHead(Node head,int val){
        Node temp = new Node(val,head);
        return temp;
    }
    // insert at tail position
    public static Node insertTail(Node head,int val){
        if(head == null) return new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
    // insert at kth position
    public static Node insertKth(Node head,int val,int k){
        if(head == null){
            if(k==1){
                return new Node(val);
            }else{
                return null;
            }
        }
        if(k==1){
            Node temp = new Node(val,head);
            return temp;
        }
        int cnt =0;
        Node temp = head;
        while (temp!=null) {
            cnt++;
            if(cnt==(k-1)){
                Node x = new Node(val,temp.next);
                temp.next =x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    // insert before kth position
    public static Node insertBefore(Node head,int val,int k){
        if(head == null){
            return null;
        }
        if(head.data == k){
            return new Node(val,head);
        }
        Node temp = head;
        boolean found = false;
        while (temp.next!=null) {
            if(temp.next.data == k){
                Node x = new Node(val,temp.next);
                temp.next =x;
                found = true;
                break;
            }
            temp = temp.next;
        }
        if(found==false){
            System.out.println("value is not found");
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {3,53,3,36,4};
        Node head = arrToLL(arr);
        printLL(head);
        head = insertHead(head, 0);
        printLL(head);
        head  = insertTail(head, 100);
        printLL(head);
        head = insertKth(head,12,8);
        printLL(head);
        head = insertBefore(head, 100, 363);
        printLL(head);
    }
}
