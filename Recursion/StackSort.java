package Recursion;

import java.util.Stack;

public class StackSort {

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Pop the top element from the stack
            int temp = stack.pop();

            // Recursively sort the remaining stack
            sortStack(stack);

            // Insert the popped element in the sorted stack
            insertSorted(stack, temp);
        }
    }
    public static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: if the stack is empty or the element is greater than the top
        // element
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        // Pop elements greater than the current element
        int temp = stack.pop();

        // Recursively insert the element
        insertSorted(stack, element);

        // Push back the popped elements
        stack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
