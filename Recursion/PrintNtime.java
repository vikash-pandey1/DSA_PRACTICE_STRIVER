package Recursion;

public class PrintNtime {
    public static void printName(int n){
        // if(n==0){
        //     return;
        // }
        // printName(n-1);
        // System.out.println("vikash");

        if(n>=11){
            return;
        }else{
            System.out.println(n);
            printName(n+1);
        }
    }
    public static void main(String[] args) {
        printName(1);
    }
}
