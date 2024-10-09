public class ReverseNo {
    public static int reverse(int no){
        int rev=0;
        while (no!=0) {
            int rem = no%10;
            rev=rev*10+rem;
            no/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int no = 1234;
        System.out.println(reverse(no));
    }
}
