package Recursion;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Pop the top element
            int temp = stack.pop();

            // Reverse the remaining stack
            reverseStack(stack);

            // Insert the popped element at the bottom
            insertAtBottom(stack, temp);
        }
    }

    public static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            // If the stack is empty, push the element
            stack.push(element);
            return;
        }

        // Pop elements and insert the element at the bottom
        int temp = stack.pop();
        insertAtBottom(stack, element);

        // Push back the popped elements
        stack.push(temp);
    }
}

