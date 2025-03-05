import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int newNo= 0;
        int ch = n;
        while (n!=0) {;
            newNo = newNo*10+n%10;
            n/=10;
        }
        System.out.println(newNo);
        if(newNo==ch){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        sc.close();
    }
}
