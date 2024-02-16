package LinkedList;

import java.util.Arrays;

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
public class SortLL {
    public static  Node arrToLL(int arr[]){
        Node h = new Node(arr[0]);
        Node move = h;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            move.next = temp;
            move = temp;
        }
        return h;
    }
    public static Node sortList(Node head) {
        Node temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp =temp.next;
        }
        System.out.print(len);
        int arr[] = new int[len];
        int i=0;
        temp = head;
        while(temp!=null){
            arr[i++] = temp.data;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        for(int j=0;j<arr.length;j++){
            temp.data = arr[j];
            temp = temp.next;
        }
        return head;
    }
    public static void traverse(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int arr[]= {13,53,3,36,4};
        Node head = arrToLL(arr);
        traverse(head);
        // System.out.println(sortList(head));
        sortList(head);
        System.out.println();
        traverse(head);
    }
}
