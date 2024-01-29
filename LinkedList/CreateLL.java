package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class CreateLL {
    public static void main(String[] args) {
        int arr[] = {1,3,63};
        Node n = new Node(arr[2]);
        System.out.println(n.data);
    }
}
