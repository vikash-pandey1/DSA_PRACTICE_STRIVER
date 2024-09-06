

import java.util.Scanner;

public class SumBtwAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =0;
        for(int i=a;i<=b;i++,a++){
            int no =i;
            while (no!=0) {
                sum+=no%10;
                no/=10;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
