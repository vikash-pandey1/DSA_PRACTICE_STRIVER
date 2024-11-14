import java.util.Scanner;

public class Stairs {
    public static int countWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        return countWays(n-1)+countWays(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(countWays(n));
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
