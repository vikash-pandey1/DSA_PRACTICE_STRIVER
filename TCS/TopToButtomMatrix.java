import java.util.Scanner;

public class TopToButtomMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  m=  sc.nextInt();
        int n = sc.nextInt();
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            dp[i][1]=1;
        }
        for(int i=1;i<=n;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=m;i++){
            for(int j=2;j<=n;j++){
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        System.out.println(dp[m][n]);
        sc.close();
    }
}
