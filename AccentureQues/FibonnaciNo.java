public class FibonnaciNo {
    public static int fibRec(int no){
        if(no<=1){
            return no;
        }
        return fibRec(no-1)+fibRec(no-2);
    }
    public static int fibTab(int no){
        if(no<=1) return no;
        int dp[]=new int[no+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=no;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[no];
    }
    public static int fibTabOpt(int no){
        if(no<=1) return no;
        int last =1;
        int secondlast =0;
        for(int i=2;i<=no;i++){
            int cur = last+secondlast;
            secondlast = last;
            last = cur;
        }
        return last;
    }
    public static void main(String[] args) {
        System.out.println(fibRec(7));
        System.out.println(fibTab(7));
        System.out.println(fibTabOpt(7));
    }
}
