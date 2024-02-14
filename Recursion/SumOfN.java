package Recursion;

public class SumOfN {
    public static int sum(int n){
        if(n==0){
            return 1; //for factorial
            // return 0; // for sum
        }else{
            return n*sum(n-1); // fact of n no
            // return n+sum(n-1);// sum of n no
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
