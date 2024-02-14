package Recursion;

public class Palindrome {
    public static boolean isPalindrome(int i,String str,int n) {
        if(i>=n/2) return true;
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        return isPalindrome(i+1, str, n);
    }

    public static void main(String[] args) {
        String str = "ana";
        System.out.println(isPalindrome(0, str, str.length()));
    }
}
