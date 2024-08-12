import java.util.Arrays;

public class UniquePathGrid {
    public static int helper(int i,int j){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        int up = helper(i-1, j);
        int left = helper(i, j-1);
        return left+up;
    }
    public static int countWaysRec(int r,int c){
        return helper(r-1, c-1);
    }
    public static int helper2(int i,int j,int dp[][]){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int up = helper(i-1, j);
        int left = helper(i, j-1);
        return dp[i][j] = left+up;
    }
    public static int countWaysMemo(int r,int c){
        int dp[][] =new int[r][c];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }
        return helper2(r-1, c-1,dp);
    }
    public static int countWaysTabu(int r,int c){
        int dp[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || j==0){
                    dp[i][j]=1;
                }else{
                dp[i][j]= dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[r-1][c-1];
    }
    public static int countWaysTabuOpt(int r,int c){
        int prev[] =new int[r];
        for(int i=0;i<r;i++){
            int curr[]= new int[c];
            for(int j=0;j<c;j++){
                if(i==0 || j==0){
                    curr[j]=1;
                }else{
                curr[j]= curr[j-1]+prev[j];
                }
            }
            prev = curr;
        }
        return prev[c-1];
    }
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        System.out.println(countWaysRec(r, c));
        System.out.println(countWaysMemo(r, c));
        System.out.println(countWaysTabu(r,c));
        System.out.println(countWaysTabuOpt(r,c));
    }
}
