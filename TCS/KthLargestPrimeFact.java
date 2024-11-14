import java.util.Scanner;

public class KthLargestPrimeFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = sc.nextInt();
        System.out.println("Enter the kth no");
        int k = sc.nextInt();
        int count=0;
        for(int i=no;i>=1;i--){
            if(no%i==0){
                count++;
            }
            if(count==k){
                System.out.println("kth largest factor no "+i);
                break;
            }
        }
        if(count!=k){
            System.out.println("no such factor no");
        }
        sc.close();
    }
}
