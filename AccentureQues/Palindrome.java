public class Palindrome {
    public static int revOfi(int no){
        int rev = 0;
        int n= no;
        while (n!=0) {
            int rem =n%10;
            rev = rev*10+rem;
            n/=10;
        }
        return rev;
    }
    public static void printPalindrome(int lower,int upper){
        for(int i=lower;i<=upper;i++){
            if(i==revOfi(i)) System.out.print(" "+i);
        }
    }

    public static boolean isPalindrome(String str){
        int len = str.length();
        int n = len-1;
        for(int i=0;i<len/2;i++,n--){
            if(str.charAt(i)!=str.charAt(n)){
                return false;
            }
        }
        return true;
    }

    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        printPalindrome(10, 200);
        String str = "kanakan";
        System.out.println();
        System.out.println(isPalindrome(str));
        System.out.println(reverse(str));
    }
}
