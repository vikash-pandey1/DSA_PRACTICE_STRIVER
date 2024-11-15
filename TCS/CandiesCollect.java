import java.util.Arrays;
import java.util.Scanner;

public class CandiesCollect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of test cases");
        int t = sc.nextInt();
        for(int l=0;l<t;l++){
            System.out.println("Enter the no of boxes");
            int n = sc.nextInt();

            System.out.println("Enter the candies in each box");
            long[] candy = new long[n];
            for(int i=0;i<n;i++){
                candy[i]=sc.nextLong();
            }
            Arrays.sort(candy);
            for(int i=1;i<n;i++){
                candy[i]+=candy[i-1];
            }
            int time = 0;
            for(int i=1;i<n;i++){
                time+=candy[i];
            }
            System.out.println(time);
        }
        sc.close();
    }
}
