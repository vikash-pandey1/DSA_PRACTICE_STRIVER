import java.util.Scanner;

public class Factorial {
    public static int getFactorial(int n){
        int fact=1;
        while (n!=0) {
            fact*=n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFactorial(n));
        sc.close();
    }
}
