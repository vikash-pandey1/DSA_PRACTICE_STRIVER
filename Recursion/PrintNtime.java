package Recursion;

public class PrintNtime {
    public static void printName(int n){
        // print name n times
        // if(n==0){
        //     return;
        // }
        // printName(n-1);
        // System.out.println("vikash");
        
        // 1 to n times
        // if(n==0){
        //     return;
        // }else{
        //     printName(n-1);
        //     System.out.println(n);
        // }

        // n to 1
        if(n==0){
            return;
        }else{
            System.out.println(n); // n to 1
            printName(n-1);
            // System.out.println(n); // 1 to n
        }
    }
    public static void main(String[] args) {
        printName(10);
    }
}
