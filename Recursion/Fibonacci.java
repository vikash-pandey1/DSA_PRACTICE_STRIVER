package Recursion;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n<=1) return n;
        return n-1+n-2;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(400000000));
    }
}
