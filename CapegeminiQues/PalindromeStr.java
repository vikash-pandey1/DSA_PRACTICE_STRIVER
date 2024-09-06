public class PalindromeStr {
    public static boolean isPalindrome(String str){
        int i=0;
        int n = str.length()-1;
        while (i<str.length()/2) {
            if(str.charAt(i)!=str.charAt(n)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "rapar";
        System.out.println(isPalindrome(str));
    }
}
