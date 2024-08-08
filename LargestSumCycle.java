import java.util.Scanner;

public class LargestSumCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int[] edge = new int[n];

        for (int i = 0; i < n; i++) {
            edge[i] = scanner.nextInt();
        }

        // Find the largest sum cycle
        int result = findLargestSumCycle(n, edge);

        // Output the result
        System.out.println(result);
        scanner.close();
    }

    private static int findLargestSumCycle(int n, int[] edge) {
        int maxCycleSum = -1;

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            int[] stack = new int[n];
            int stackSize = 0;

            int cycleSum = dfs(i, edge, visited, stack, stackSize);

            if (cycleSum != -1) {
                maxCycleSum = Math.max(maxCycleSum, cycleSum);
            }
        }

        return maxCycleSum;
    }

    private static int dfs(int node, int[] edge, boolean[] visited, int[] stack, int stackSize) {
        visited[node] = true;
        stack[stackSize++] = node;

        int nextNode = edge[node];
        if (nextNode == -1) {
            return -1;
        }

        if (!visited[nextNode]) {
            return dfs(nextNode, edge, visited, stack, stackSize);
        } else {
            // Found a cycle
            int cycleSum = 0;
            for (int i = 0; i < stackSize; i++) {
                cycleSum += stack[i];
            }
            return cycleSum;
        }
        // findLargestSumCycle(nextNode, edge);
    }
}

