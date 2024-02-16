package LinkedList;

import java.util.Arrays;

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

public class SortLL_1_2_3 {
    public static Node arrToLL(int arr[]) {
        Node h = new Node(arr[0]);
        Node move = h;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            move.next = temp;
            move = temp;
        }
        return h;
    }

    public static Node sortList(Node head) {
        Node temp = head;
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        while (temp != null) {
            if (temp.data == 0)
                cnt0++;
            else if (temp.data == 1)
                cnt1++;
            else
                cnt2++;
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (cnt0 > 0) {
                temp.data = 0;
                cnt0--;
            } else if (cnt1 > 0) {
                temp.data = 1;
                cnt1--;
            }else if(cnt2>0){
                temp.data = 2;
                cnt2--;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 13, 53, 3, 36, 4 };
        Node head = arrToLL(arr);
        traverse(head);
        sortList(head);
        traverse(head);
    }
}
