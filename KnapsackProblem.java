public class KnapsackProblem {

    public static void main(String[] args) {
        int[] weights = {100, 50, 20, 10, 7, 3};
        int[] profits = {100, 50, 20, 10, 7, 3};
        int capacity = 165;
        int n = weights.length;

        int[][] dp = new int[n + 1][capacity + 1];

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], profits[i - 1] + dp[i - 1][w - weights[i - 1]]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // Maximum profit is stored in dp[n][capacity]
        int maxProfit = dp[n][capacity];

        // Print the maximum profit
        System.out.println("Maximum profit: " + maxProfit);
    }
}

