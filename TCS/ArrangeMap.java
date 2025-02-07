import java.util.*;

public class ArrangeMap {
    static class Point {
        int x, y, distance;

        Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static int shortestDistance(int n, int m, char[][] map) {
        int sheetCount = n / m;
        char[][][] sheets = new char[sheetCount][sheetCount][m * m];
        int sx = -1, sy = -1, dx = -1, dy = -1;

        // Extract sheets
        for (int i = 0; i < sheetCount; i++) {
            for (int j = 0; j < sheetCount; j++) {
                sheets[i][j] = new char[m][m]; // Initialize each sheet as a 2D array
                for (int x = 0; x < m; x++) {
                    for (int y = 0; y < m; y++) {
                        char cell = map[i * m + x][j * m + y];
                        sheets[i][j][x][y] = cell; // Assign value to the correct position
                        if (cell == 'S') {
                            sx = i * m + x;
                            sy = j * m + y;
                        } else if (cell == 'D') {
                            dx = i * m + x;
                            dy = j * m + y;
                        }
                    }
                }
            }
        }

        // BFS to find shortest distance from S to D
        return bfs(map, sx, sy, dx, dy, n);
    }

    public static int bfs(char[][] map, int sx, int sy, int dx, int dy, int n) {
        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        queue.add(new Point(sx, sy, 0));
        visited[sx][sy] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            // If we reach D, return the distance
            if (current.x == dx && current.y == dy) {
                return current.distance;
            }

            for (int[] dir : directions) {
                int nx = current.x + dir[0];
                int ny = current.y + dir[1];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny] && (map[nx][ny] == 'T' || map[nx][ny] == 'D')) {
                    visited[nx][ny] = true;
                    queue.add(new Point(nx, ny, current.distance + 1));
                }
            }
        }

        return -1; // If there's no valid path
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] map = new char[n][n];

        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = row.charAt(j);
            }
        }

        System.out.println(shortestDistance(n, m, map));
    }
}
