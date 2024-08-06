package Stack_Queue;

import java.util.Stack;

public class ValidParenthes {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    System.out.println("run when closing more");
                    return false;
                }else{
                    if(st.peek()=='{' && ch=='}' || st.peek()=='[' && ch==']' || st.peek()=='(' && ch==')'){
                        st.pop();
                    }else{
                        // System.out.println("run when opening more");
                        return false;
                    }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }

            return false;
    }
    public static void main(String[] args) {
        System.out.println(isValid("(()"));
    }
}
