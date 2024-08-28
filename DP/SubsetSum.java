import java.util.Arrays;

public class SubsetSum {
    public static boolean subsetSumUtil(int ind, int target, int arr[], int dp[][]) {
        if (target == 0)
            return true;
        if (ind == 0)
            return arr[0] == target;
        if (dp[ind][target] != -1) {
            return dp[ind][target] == 0 ? false : true;
        }

        boolean notTaken = subsetSumUtil(ind - 1, target, arr, dp);
        boolean taken = false;
        if (arr[ind] <= target) {
            taken = subsetSumUtil(ind - 1, target - arr[ind], arr, dp);
        }
        dp[ind][target] = notTaken || taken ? 1 : 0;
        return notTaken || taken;
    }

    public static boolean canPartition(int n, int arr[]) {
        int totSum = 0;
        for (int i = 0; i < n; i++) {
            totSum += arr[i];
        }
        if (totSum % 2 == 1)
            return false;
        else {
            int k = totSum / 2;
            int dp[][] = new int[n][k + 1];
            for (int row[] : dp)
                Arrays.fill(row, -1);
            // Call the helper function to check if a valid subset exists
            return subsetSumUtil(n - 1, k, arr, dp);

        }
    }

    static boolean canPartitionTabu(int n, int[] arr) {
        // Calculate the total sum of the array elements
        int totSum = 0;
        for (int i = 0; i < n; i++) {
            totSum += arr[i];
        }

        // If the total sum is odd, it cannot be partitioned into equal subsets
        if (totSum % 2 == 1)
            return false;
        else {
            // Calculate the target sum for each subset
            int k = totSum / 2;
            // Create a DP table to store the results of subproblems
            boolean dp[][] = new boolean[n][k + 1];

            // Initialize the first row of the DP table
            for (int i = 0; i < n; i++) {
                dp[i][0] = true;
            }

            // Initialize the first column of the DP table
            if (arr[0] <= k) {
                dp[0][arr[0]] = true;
            }

            // Fill in the DP table using bottom-up dynamic programming
            for (int ind = 1; ind < n; ind++) {
                for (int target = 1; target <= k; target++) {
                    // Calculate if the current element is not taken
                    boolean notTaken = dp[ind - 1][target];

                    // Calculate if the current element is taken
                    boolean taken = false;
                    if (arr[ind] <= target) {
                        taken = dp[ind - 1][target - arr[ind]];
                    }

                    // Update the DP table for the current element and target sum
                    dp[ind][target] = notTaken || taken;
                }
            }

            // The result is stored in the last cell of the DP table
            return dp[n - 1][k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 3, 3, 4, 5 };
        int n = arr.length;

        // Check if the array can be partitioned into two equal subsets
        if (canPartition(n, arr))
            System.out.println("The Array can be partitioned into two equal subsets");
        else
            System.out.println("The Array cannot be partitioned into two equal subsets");
        if (canPartitionTabu(n, arr))
            System.out.println("The Array can be partitioned into two equal subsets");
        else
            System.out.println("The Array cannot be partitioned into two equal subsets");
    }
}
