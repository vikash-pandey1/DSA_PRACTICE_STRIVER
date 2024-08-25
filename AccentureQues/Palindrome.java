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
    public static void main(String[] args) {
        printPalindrome(10, 90);
    }
}
