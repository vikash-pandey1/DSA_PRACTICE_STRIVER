import java.util.Arrays;

public class UniquePathObs {
    public static int helper(int m,int n,int grid[][],int dp[][]){
        if(m>=0 && n>=0 && grid[m][n]==-1 ) return 0;
        if(m==0 && n==0 ) return 1;
        if(m<0 || n<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        return dp[m][n] = helper(m-1, n,grid,dp)+helper(m, n-1,grid,dp);
    }
    public static int findWayRec(int grid[][]){
        int m = grid.length;
        int n= grid[0].length;
        int dp[][]=new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }
        return helper(m-1, n-1,grid,dp);
    }

    public static int findWayTabu(int grid[][]){
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==-1) grid[i][j]=0;
                else if(i==0 || j==0){
                    grid[i][j]=1;
                }else{
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }
            }
        }
        return grid[m-1][n-1];
    }
    public static void main(String[] args) {
        int[][] maze = {
            {0, 0, 0},
            {0, -1, 0},
            {0, 0, 0}
        };
        System.out.println(findWayRec(maze));
        System.out.println(findWayTabu(maze));
    }
}
