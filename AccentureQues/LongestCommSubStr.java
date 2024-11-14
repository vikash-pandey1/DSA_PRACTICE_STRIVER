public class LongestCommSubStr {
    public static void lcs(String str,String str2){
        int m=str.length();
        int n = str2.length();
        int dp[][]=new int[m+1][n+1];
        int maxLen =0;
        int row =0,col=0;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(str.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if(dp[i][j]>maxLen){
                        maxLen = dp[i][j];
                        row=i;
                        col=j;
                    }
                }else{
                    dp[i][j]=0;
                }
            }
        }
        if(maxLen==0){
            System.out.println("no common sub string");
        }else{
            String temp ="";
            while (dp[row][col]!=0){
                temp = str.charAt(row-1)+temp;
                row--;
                col--;
            }
            int ans = 0;
            for(int i=0;i<temp.length();i++){
                ans = ans+str.charAt(i);
            }
        System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        String str = "fortune";
        String str2 = "retune";
        lcs(str, str2);
    }
}
