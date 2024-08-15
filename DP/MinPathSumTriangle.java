import java.util.Arrays;

public class MinPathSumTriangle {
    public static int helper(int arr[][], int n, int i, int j) {

        if (i == n - 1)
            return arr[n - 1][j];
        int down = arr[i][j] + helper(arr, n, i + 1, j);
        int digonl = arr[i][j] + helper(arr, n, i + 1, j + 1);
        return Math.min(down, digonl);
    }

    public static int minPathRec(int arr[][], int n) {
        return helper(arr, n, 0, 0);
    }

    public static int helper2(int arr[][], int n, int i, int j, int dp[][]) {

        if (i == n - 1)
            return arr[n - 1][j];
        if (dp[i][j] != -1)
            return dp[i][j];
        int down = arr[i][j] + helper2(arr, n, i + 1, j, dp);
        int digonl = arr[i][j] + helper2(arr, n, i + 1, j + 1, dp);
        return dp[i][j] = Math.min(down, digonl);
    }

    public static int minPathMemo(int arr[][], int n) {
        int dp[][] = new int[n][n];
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        return helper2(arr, n, 0, 0, dp);
    }

    public static int minPathTabu(int arr[][], int n) {
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = arr[n - 1][i];
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                int down = arr[i][j] + dp[i + 1][j];
                int digonl = arr[i][j] + dp[i + 1][j + 1];
                dp[i][j] = Math.min(down, digonl);
            }
        }
        return dp[0][0];
    }

    public static int minPathOpt(int triangle[][],int n){
        int[] front = new int[n]; // Stores the results for the current row
        int[] cur = new int[n];   // Stores the results for the next row

        // Initialize the front array with the values from the bottom row of the triangle
        for (int j = 0; j < n; j++) {
            front[j] = triangle[n - 1][j];
        }

        // Starting from the second to last row, calculate the minimum path sum for each element
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                // Calculate the two possible paths: moving down or moving diagonally
                int down = triangle[i][j] + front[j];
                int diagonal = triangle[i][j] + front[j + 1];

                // Store the minimum of the two paths in the cur array
                cur[j] = Math.min(down, diagonal);
            }
            
            // Update the front array with the values from the cur array for the next row
            front = cur.clone();
        }

        // The result is stored at the top of the front array
        return front[0];
    }

    public static void main(String[] args) {
        int triangle[][] = { { 1 },
                { 2, 3 },
                { 3, 6, 7 },
                { 8, 9, 6, 10 } };

        int n = triangle.length;
        System.out.println(minPathRec(triangle, n));
        System.out.println(minPathMemo(triangle, n));
        System.out.println(minPathTabu(triangle, n));

    }
}
