import java.util.Arrays;

public class MinPath_sum {
    public static int helper(int arr[][],int m,int n){
        if(m==0 && n==0) return arr[0][0];
        if(m<0 || n<0) return (int) Math.pow(10, 9);;
        int up = arr[m][n]+helper(arr, m-1, n);
        int left = arr[m][n]+helper(arr, m, n-1);
        return Math.min(up,left);
    }
    public static int minPathRec(int arr[][]){
        int m = arr.length;
        int n= arr[0].length;
        return helper(arr,m-1,n-1);
    }
    public static int helper2(int arr[][],int m,int n,int dp[][]){
        if(m==0 && n==0) return arr[0][0];
        if(m<0 || n<0) return (int) Math.pow(10, 9);;
        if(dp[m][n]!=-1) return dp[m][n];
        int up = arr[m][n]+helper2(arr, m-1, n,dp);
        int left = arr[m][n]+helper2(arr, m, n-1,dp);
        return dp[m][n]= Math.min(up,left);
    }
    public static int minPathMemo(int arr[][]){
        
        int m = arr.length;
        int n= arr[0].length;
        int dp[][]=new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }
        return helper2(arr,m-1,n-1,dp);
    }
    public static int minPathTabu(int arr[][]){
        int m = arr.length;
        int n= arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    arr[i][j]=arr[0][0];
                }else{
                    int right = Integer.MAX_VALUE;
                    int buttom = Integer.MAX_VALUE;
                    if(j>0) right = arr[i][j]+arr[i][j-1];
                    if(i>0) buttom =arr[i][j]+arr[i-1][j];
                    arr[i][j]=Math.min(right,buttom);
                }
            }
        }
        return arr[m-1][n-1];
    }
    public static void main(String[] args) {
        int arr[][]={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathRec(arr));
        System.out.println(minPathMemo(arr));
        System.out.println(minPathTabu(arr));
    }
}
