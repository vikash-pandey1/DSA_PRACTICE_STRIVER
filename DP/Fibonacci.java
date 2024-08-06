public class Fibonacci {
    public static int fibRec(int n){
        if(n<=1) return n;
        return fibRec(n-1)+fibRec(n-2);
    }

    public static int fibMemo(int n){
        if(n<=1) return n;
        Integer dp[] =new Integer[n+1];
        return helperFib(n, dp);
    }
    public static int helperFib(int n,Integer [] arr){
        if(n<=1) return n;
        if(arr[n]!=null) return arr[n];
        arr[n] = helperFib(n-1,arr)+helperFib(n-2,arr);
        return arr[n];
    }
    public static int fibTab(int n){
        if(n<=1) return n;
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int fibTabOpt(int n){
        if(n<=1) return n;
        int prev =1;
        int prev2 = 0;
        for(int i=2;i<=n;i++){
            int curr = prev+prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public static void main(String[] args) {
        System.out.println(fibRec(6));
        System.out.println(fibMemo(6));
        System.out.println(fibTab(6));
        System.out.println(fibTabOpt(0));
    }
}
