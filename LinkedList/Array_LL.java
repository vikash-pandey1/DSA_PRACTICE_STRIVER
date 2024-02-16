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
public class Array_LL {

    // array to linked list
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
    // traversal of linked list
    public static void traverse(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // size of linked list
    public static int length(Node head){
        Node temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    // search in linked list

    public static int checkNo(Node head,int target){
        Node temp = head;
        while(temp!=null){
            if(temp.data == target){
                return temp.data;
            }
            temp = temp.next;
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[]= {13,53,3,36,4};
        Node head = converArr2LL(arr);
        System.out.println(head.data);
        traverse(head);
        System.out.println("the length of given linkedList is  "+length(head));
        System.out.println(checkNo(head, 0));
    }
}
