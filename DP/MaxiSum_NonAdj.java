public class MaxiSum_NonAdj {
    public static int f(int idx,int arr[]){
        if(idx<0) return 0;
        if(idx==0) return arr[idx];
        int pick = arr[idx]+f(idx-2, arr);
        int notPick = 0+f(idx-1, arr);
        return Math.max(pick, notPick);
    }
    public static int maxSumRec(int arr[]){
        int n= arr.length;
        return f(n-1,arr);
    }


    public static int f2(int idx,int arr[],Integer dp[]){
        if(idx<0) return 0;
        if(idx==0) return arr[idx];
        int pick = arr[idx]+f2(idx-2, arr,dp);
        int notPick = 0+f2(idx-1, arr,dp);
        return dp[idx]=  Math.max(pick, notPick);
    }
    public static int maxSumMemo(int arr[]){
        int n= arr.length;
        Integer dp[] = new Integer[n+1];
        return f2(n-1,arr,dp);
    }

    public static int maxSumTabu(int arr[]){
        int n = arr.length;
        int dp[] = new int[n];
        dp[0] = arr[0];
        for(int i=1;i<n;i++){
            int pick = arr[i];
            if(i>1) pick+=dp[i-2];
            int notPick = 0+dp[i-1];
            dp[i] = Math.max(pick,notPick);
        }
        return dp[n-1];
    }
    public static int maxSumSpaceOpt(int arr[]){
        int n= arr.length;
        int prev = arr[0];
        int prev2 = 0;
        for(int i=1;i<n;i++){
            int pick = arr[i];
            if(i>1) pick+=prev2;
            int notPick = 0+prev;
            int curr = Math.max(pick,notPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(maxSumRec(arr));
        System.out.println(maxSumMemo(arr));
        System.out.println(maxSumTabu(arr));
        System.out.println(maxSumSpaceOpt(arr));
    }
}
