public class FrogJump {
    // public static int frogJump(int n,int arr[]){ // recursive solution
    // return f(n-1,arr);
    // }
    // public static int f(int idx,int arr[]){
    // if(idx==0) return 0;
    // int right = Integer.MAX_VALUE;
    // int left = f(idx-1,arr)+Math.abs(arr[idx]-arr[idx-1]);
    // if(idx>1){
    // right = f(idx-2,arr)+Math.abs(arr[idx]-arr[idx-2]);
    // }
    // return Math.min(left,right);
    // }

    // public static int frogJump(int n,int arr[]){ // dp memoization solution
    // Integer dp[] = new Integer[n+1];
    // return f(n-1,arr,dp);
    // }
    // public static int f(int idx,int arr[],Integer dp[]){
    // if(idx==0) return 0;
    // if(dp[idx]!=null) return dp[idx];
    // int right = Integer.MAX_VALUE;
    // int left = f(idx-1,arr,dp)+Math.abs(arr[idx]-arr[idx-1]);
    // if(idx>1){
    // right = f(idx-2,arr,dp)+Math.abs(arr[idx]-arr[idx-2]);
    // }
    // return dp[idx] = Math.min(left,right);
    // }
    public static int frogJumpTabu(int n, int arr[]) {
        int dp[] = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int fs = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            int se = Integer.MAX_VALUE;
            if (i > 1) {
                se = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            }
            dp[i] = Math.min(fs, se);
        }
        return dp[n - 1];
    }

    public static int frogJumpTabu2(int n, int arr[]) {
        int prev1 = 0, prev2 = 0;
        for (int i = 1; i < n; i++) {
            int fs = prev1 + Math.abs(arr[i] - arr[i - 1]);
            int se = Integer.MAX_VALUE;
            if (i > 1) {
                se = prev2 + Math.abs(arr[i] - arr[i - 2]);
            }
            int curr = Math.min(fs, se);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 10 };
        // System.out.println(frogJump(4, arr));
        System.out.println(frogJumpTabu(4, arr));
        System.out.println(frogJumpTabu2(4, arr));
    }
}
