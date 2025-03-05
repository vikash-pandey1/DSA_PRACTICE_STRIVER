import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactor {
    public static boolean isPrime(int prime){
        if(prime<=1) return false;
        for(int i=2;i<=Math.sqrt(prime);i++){
            if(prime%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=no;i++){
            if(no%i==0){
                al.add(i);
                System.out.println(i);
            }
        }
        int count =0; 
        for(int ch:al){
            if(isPrime(ch)){
                System.out.print("prime "+ ch+" ");
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
