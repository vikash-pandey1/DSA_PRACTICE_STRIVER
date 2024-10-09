public class LinkedListMiddle {
        Node head;
        
        static class Node {
            int data;
            Node next;
            // Constructor
            Node(int d) {
                data = d;
                next = null;
            }
        }
    
        // Function to find the middle element of the linked list
        void printMiddle() {
            Node slow = head;
            Node fast = head;
    
            if (head != null) {
                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                System.out.println("The middle element is: " + slow.data);
            }
        }
        public  boolean isCycle(){
            Node slow=head,fast = head;
            while (fast!=null && fast.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
        }
    
        // Function to add a new node at the end of the list
        public void addToTheLast(Node node) {
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }
        public void connectLast(){
            Node curr = head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next = head;
        }
    
        public static void main(String[] args) {
            LinkedListMiddle list = new LinkedListMiddle();
            
            // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
            list.addToTheLast(new Node(1));
            list.addToTheLast(new Node(2));
            list.addToTheLast(new Node(3));
            list.addToTheLast(new Node(4));
            list.addToTheLast(new Node(5));
    
            list.printMiddle();  // Output will be 3
            list.connectLast();
            System.out.println(list.isCycle());
        }
    }
