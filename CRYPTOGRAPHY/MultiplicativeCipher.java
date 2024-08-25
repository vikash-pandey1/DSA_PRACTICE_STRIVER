package CRYPTOGRAPHY;

public class MultiplicativeCipher {

    public static String encrypt(String str, int key) {
        if (!isValidKey(key)) {
            throw new IllegalArgumentException("Invalid key. Key must have a multiplicative inverse modulo 26 and 10.");
        }
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                char ch = (char) (((c - 'A') * key % 26) + 'A');
                ans.append(ch);
            } else if (Character.isLowerCase(c)) {
                char ch = (char) (((c - 'a') * key % 26) + 'a');
                ans.append(ch);
            } else if (Character.isDigit(c)) {
                char ch = (char) (((c - '0') * key % 10) + '0');
                ans.append(ch);
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }

    public static String decrypt(String str, int key) {
        if (!isValidKey(key)) {
            throw new IllegalArgumentException("Invalid key. Key must have a multiplicative inverse modulo 26 and 10.");
        }
        StringBuilder ans = new StringBuilder();
        int inverse26 = findMultiplicativeInverse(key, 26); // Compute the inverse of the key mod 26
        int inverse10 = findMultiplicativeInverse(key, 10); // Compute the inverse of the key mod 10 for digits
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                char c = (char) (((ch - 'A') * inverse26 % 26 + 26) % 26 + 'A');
                ans.append(c);
            } else if (Character.isLowerCase(ch)) {
                char c = (char) (((ch - 'a') * inverse26 % 26 + 26) % 26 + 'a');
                ans.append(c);
            } else if (Character.isDigit(ch)) {
                char c = (char) (((ch - '0') * inverse10 % 10 + 10) % 10 + '0');
                ans.append(c);
            } else {
                ans.append(ch); // Append non-alphanumeric characters as is
            }
        }
        return ans.toString();
    }

    public static int findMultiplicativeInverse(int key, int mod) {
        for (int i = 1; i < mod; i++) {
            if ((key * i) % mod == 1) {
                return i;
            }
        }
        throw new IllegalArgumentException("Multiplicative inverse does not exist for key: " + key + " and mod: " + mod);
    }

    public static boolean isValidKey(int key) {
        return gcd(key, 26) == 1 && gcd(key, 10) == 1;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        String plainText = "1parth";
        int key = 7;  // 7 has a multiplicative inverse both modulo 26 and modulo 10

        // Encrypt the plain text
        String cipherText = encrypt(plainText, key);
        System.out.println("Cipher text: " + cipherText);

        // Decrypt the cipher text
        String decryptedText = decrypt(cipherText, key);
        System.out.println("Decrypted text: " + decryptedText);
    }
}
