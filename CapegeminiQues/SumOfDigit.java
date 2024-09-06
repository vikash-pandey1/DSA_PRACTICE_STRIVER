public class SumOfDigit {
    public static void reverseNo(int no){
        int sum=0;
        while (no!=0) {
            int rem =no%10;
            sum=sum*10+rem;
            no/=10;
        }
        System.out.println(sum);
    }
    public static void sum(int no){
        int sum=0;
        while(no!=0){
            int rem=no%10;
            sum+=rem;
            no/=10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int no=1323;
        reverseNo(no);
        sum(no);
    }
}
