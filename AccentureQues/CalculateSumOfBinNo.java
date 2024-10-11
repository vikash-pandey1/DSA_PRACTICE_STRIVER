public class CalculateSumOfBinNo {
    public static int sumOfBinary(int no){
        int rem = 0;
        while (no>0) {
            rem = rem+no%2;
            no/=2;
            System.out.println(rem);
        }
        return rem;
    }
    public static void main(String[] args) {
        int no = 11;
        System.out.println(sumOfBinary(no));
    }
}
