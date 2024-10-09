public class Factorial {
    public static int calculateFactorial(int no){
        if(no<=1){
            return 1;
        }
        return no*calculateFactorial(no-1);
    }
    public static int calculateFactorial2(int no){
        int sum =1;
        while (no!=1) {
            sum*=no--;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
        System.out.println(calculateFactorial2(5));
    }
}
