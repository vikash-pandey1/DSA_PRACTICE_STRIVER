import java.util.ArrayList;
import java.util.Scanner;

public class ConsicutivePrimeSum {
    public static boolean isPrime(int no){
        for(int i=2;i<=no/2;i++){
            if(no%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i<=no;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        int sum =0,count=0;
        for(int x:list){
            sum+=x;
            if(sum>no){
                break;
            }
            if(isPrime(sum)){
                System.out.println(sum);
                count++;
            }
        }
        System.out.println(count-1);
        sc.close();
    }
}
