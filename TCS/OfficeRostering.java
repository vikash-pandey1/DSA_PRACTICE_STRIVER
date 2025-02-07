import java.util.*;

public class OfficeRostering {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of employees and friendships
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // Initialize the friendship list (graph)
        List<List<Integer>> friends = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            friends.add(new ArrayList<>());
        }
        
        // Read the friendships and build the graph
        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            friends.get(u).add(v);
            friends.get(v).add(u);
        }
        
        // Read the target rostering value
        int K = scanner.nextInt();
        
        // Initialize the attendance of employees
        boolean[] currentAttendance = new boolean[N];
        Arrays.fill(currentAttendance, true); // All employees work from office on Day 1
        
        // Keep track of total rostering value
        int totalRostering = N;
        int days = 1; // Start from Day 1
        
        // Simulate the attendance over days
        while (totalRostering < K) {
            boolean[] nextAttendance = new boolean[N];
            int dailyRostering = 0;
            
            for (int i = 0; i < N; i++) {
                int officeCount = 0;
                // Count how many of the current employee's friends worked from the office
                for (int friend : friends.get(i)) {
                    if (currentAttendance[friend]) {
                        officeCount++;
                    }
                }
                
                // Apply the attendance rules
                if (currentAttendance[i]) {
                    // Worked from office today, and exactly 3 friends worked from office
                    nextAttendance[i] = (officeCount == 3);
                } else {
                    // Worked from home today, and less than 3 friends worked from office
                    nextAttendance[i] = (officeCount < 3);
                }
                
                // Count how many employees are working from the office today
                if (nextAttendance[i]) {
                    dailyRostering++;
                }
            }
            
            // Update total rostering value
            totalRostering += dailyRostering;
            // Move to the next day
            currentAttendance = nextAttendance;
            days++;
        }
        
        // Output the number of days it took to reach the target rostering value
        System.out.println(days);
        
        scanner.close();
    }
}
