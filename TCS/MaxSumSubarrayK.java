public class MaxSumSubarrayK {
    public static int maxSumSubarray(int[] nums, int k) {
        int n = nums.length;
        if (n < k) return -1; // Edge case: If array size is smaller than k

        int maxSum = 0, windowSum = 0;

        // Compute the sum of first 'k' elements
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k]; // Add next element, remove first element of previous window
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum Sum Subarray: " + maxSumSubarray(arr, k)); // Output: 9
    }
}
