import java.util.Scanner;

public class SumOfTwoPrime {
    public static boolean isPrime(int no){
        if(no<2) return false;
        for(int i=2;i<=Math.sqrt(no);i++){
            if(no%i==0) return false;
        }
        return true;
    }
    public static boolean checksumOfTwoPrimes(int n){
        for(int i=2;i<=n/2;i++){
            if(isPrime(i) && isPrime(n-i)){
                System.out.println(n+" = "+i+" + "+(n-i));
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(!checksumOfTwoPrimes(n)){
            System.out.println(n+" cannot be expressed as the sum of two prime no");
        }
        sc.close();
    }
}
