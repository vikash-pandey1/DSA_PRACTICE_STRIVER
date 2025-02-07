import java.util.*;

public class StringObsession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of substrings
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        // Read substrings
        String[] substrings = scanner.nextLine().split(" ");
        
        // Read the main string
        String mainString = scanner.nextLine();
        
        // Call the function to find the maximum number of substrings that can be removed
        int maxRemovals = maxSubstringsRemoved(mainString, substrings);
        
        // Print the result
        System.out.println(maxRemovals);
    }
    
    private static int maxSubstringsRemoved(String mainString, String[] substrings) {
        int maxCount = 0;
        for (int i = 0; i < (1 << substrings.length); i++) {
            String temp = mainString;
            int count = 0;
            for (int j = 0; j < substrings.length; j++) {
                if (((i >> j) & 1) == 1) {
                    if (temp.contains(substrings[j])) {
                        temp = temp.replaceFirst(substrings[j], "");
                        count++;
                    }
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}