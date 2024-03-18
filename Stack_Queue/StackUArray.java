package Stack_Queue;

class stack{
    int arr[] = new int[100];
    int top = -1;

    public  void push(int data) {
        top++;
        arr[top] = data;
    }

    public  int pop() {
        int x = arr[top];
        top--;
        return x;
    }

    public  int top() {
        return arr[top];
    }

    public  int size() {
        return top + 1;
    }
    public  void print(){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>0){
                System.out.println("|"+arr[i]+"|");
            }
        }
    }
}
public class StackUArray {
    

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        System.out.println( "pop element "+s.pop());
        System.out.println("size of stack "+s.size());
        System.out.println("top of elements "+s.pop());
        // System.out.println();
        s.print();
    }
}
