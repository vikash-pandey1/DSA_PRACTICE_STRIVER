import java.util.Arrays;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are not the same, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        // Convert the second string to a mutable version
        String str2Copy = str2;
        // Loop through each character in str1
        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);

            // Check if the character is in str2Copy
            int index = str2Copy.indexOf(currentChar);
            if (index != -1) {
                // Remove the character from str2Copy using replaceFirst
                str2Copy = str2Copy.replaceFirst(String.valueOf(currentChar), "");
            } else {
                // If character is not found, they are not anagrams
                return false;
            }
        }

        // If all characters are matched, the remaining str2Copy should be empty
        return str2Copy.isEmpty();
    }
    public static boolean areAnagrams2(String str1, String str2) {
        // If lengths are not the same, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to count characters
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Increment character count based on str1
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }

        // Decrement character count based on str2
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }

        // If all counts are zero, the strings are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
 public static boolean areAnagrams3(String str1, String str2) {
        // If lengths are not the same, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }


        if (areAnagrams2(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        if (areAnagrams3(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
