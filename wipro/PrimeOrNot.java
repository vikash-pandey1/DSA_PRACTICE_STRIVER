import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int no){
        if(no<=2){
            return true;
        }
        for(int i=2;i<no;i++){
            if(no%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(isPrime(sc.nextInt())){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
