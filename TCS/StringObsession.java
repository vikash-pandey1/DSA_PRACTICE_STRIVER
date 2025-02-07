import java.util.*;

public class StringObsession {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of substrings
        int N = sc.nextInt();
        sc.nextLine();  // Consume newline
        
        // Read the substrings
        String[] substrings = sc.nextLine().split(" ");
        
        // Read the main string
        String mainString = sc.nextLine();
        
        // Initialize a variable to keep track of the maximum number of substrings removed
        int maxRemoved = 0;
        
        // Try to remove substrings in all possible orders using a backtracking approach
        maxRemoved = findMaxRemovals(mainString, substrings, 0);
        
        // Output the result
        System.out.println(maxRemoved);
        
        sc.close();
    }

    // Helper method to recursively try removing substrings
    private static int findMaxRemovals(String str, String[] substrings, int removedCount) {
        int maxRemovals = removedCount;
        
        // Try removing each substring and recursively call the function
        for (int i = 0; i < substrings.length; i++) {
            String substr = substrings[i];
            if (str.contains(substr)) {
                // If the substring is present, remove it and continue
                String newStr = str.replaceFirst(substr, "");
                maxRemovals = Math.max(maxRemovals, findMaxRemovals(newStr, substrings, removedCount + 1));
            }
        }
        
        return maxRemovals;
    }
}



import java.util.*;

public class StringObsession {
    public static int maxRemovals(String mainString, String[] substrings) {
        int count = 0;
        int i = 0;

        while (i < mainString.length()) {
            int maxLen = 0;
            int maxIndex = -1;

            for (int j = 0; j < substrings.length; j++) {
                String substring = substrings[j];
                if (mainString.startsWith(substring, i) && substring.length() > maxLen) {
                    maxLen = substring.length();
                    maxIndex = j;
                }
            }

            if (maxIndex != -1) {
                count++;
                i += maxLen;
            } else {
                i++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] substrings = new String[N];
        for (int i = 0; i < N; i++) {
            substrings[i] = scanner.next();
        }
        String mainString = scanner.next();

        int maxRemovals = maxRemovals(mainString, substrings);
        System.out.println(maxRemovals);
    }
}