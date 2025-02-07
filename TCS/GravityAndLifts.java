import java.util.*;

public class GravityAndLifts {
    static class Position {
        int row, col, moves;

        public Position(int row, int col, int moves) {
            this.row = row;
            this.col = col;
            this.moves = moves;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[][] grid = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int startRow = sc.nextInt();
        int startCol = sc.nextInt();
        int destRow = sc.nextInt();
        int destCol = sc.nextInt();

        // Check if destination is stable
        if (!isStable(grid, destRow, destCol)) {
            System.out.println("Impossible");
            return;
        }

        // BFS to find the shortest path
        int result = bfs(grid, N, M, startRow, startCol, destRow, destCol);
        System.out.println(result == Integer.MAX_VALUE ? "Impossible" : result);
    }

    private static boolean isStable(int[][] grid, int row, int col) {
        if (row == grid.length - 1) return true; // Last row is stable
        return grid[row + 1][col] == 1; // Stable if lift directly below
    }

    private static int bfs(int[][] grid, int N, int M, int startRow, int startCol, int destRow, int destCol) {
        boolean[][] visited = new boolean[N][M];
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(startRow, startCol, 0));
        visited[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            Position curr = queue.poll();

            // Gravity effect: Slide down if not stable
            int row = curr.row;
            while (row < N - 1 && grid[row + 1][curr.col] == 0) {
                row++;
            }

            // Check if we reached the destination
            if (row == destRow && curr.col == destCol) {
                return curr.moves + Math.abs(row - curr.row);
            }

            // Move upward using lifts
            for (int r = row - 1; r >= 0 && grid[r][curr.col] == 1; r--) {
                if (!visited[r][curr.col]) {
                    visited[r][curr.col] = true;
                    queue.add(new Position(r, curr.col, curr.moves + 1));
                }
            }

            // Mark the current stable cell as visited
            if (!visited[row][curr.col]) {
                visited[row][curr.col] = true;
                queue.add(new Position(row, curr.col, curr.moves));
            }
        }

        return Integer.MAX_VALUE; // Destination not reachable
    }
}
