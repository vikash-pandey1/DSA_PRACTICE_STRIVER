import java.util.Scanner;

public class HousesProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            int rob = arr[i];
            int notRob = 0;
            if(i-2>=0){
                rob+=dp[i-2];
            }
            if(i-1>=0){
                notRob+=dp[i-1];
            }
            dp[i]=Math.max(rob,notRob);
        }
        System.out.println(dp[n-1]);
        sc.close();
    }
}

