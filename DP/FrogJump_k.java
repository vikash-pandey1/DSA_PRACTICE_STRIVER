public class FrogJump_k {
    public static int f(int idx, int arr[], int k) {
        if (idx == 0)
            return 0;
        int minStep = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (idx - i >= 0) {
                int jump = f(idx - i, arr, k) + Math.abs(arr[idx] - arr[idx - i]);
                minStep = Math.min(minStep, jump);
            }
        }
        return minStep;
    }

    public static int frogJump_rec(int n, int arr[], int k) {
        return f(n - 1, arr, k);
    }

    public static int f2(int idx, int arr[], int k, Integer dp[]) {
        if (idx == 0)
            return 0;
        if (dp[idx] != null)
            return dp[idx];
        int minStep = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (idx - i >= 0) {
                int jump = f2(idx - i, arr, k, dp) + Math.abs(arr[idx] - arr[idx - i]);
                minStep = Math.min(minStep, jump);
            }
        }
        return dp[idx] = minStep;
    }

    public static int frogJump_memo(int n, int[] arr, int k) {
        Integer dp[] = new Integer[n + 1];
        return f2(n - 1, arr, k, dp);
    }

    public static int frogJump_tabu(int n, int arr[], int k) {
        int dp[] = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int minStep = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(arr[i] - arr[i - j]);
                    minStep = Math.min(jump, minStep);
                }
            }
            dp[i] = minStep;
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 10 };
        System.out.println(frogJump_rec(4, arr, 3));
        System.out.println(frogJump_memo(4, arr, 2));
        System.out.println(frogJump_tabu(4, arr, 1));

    }
}
