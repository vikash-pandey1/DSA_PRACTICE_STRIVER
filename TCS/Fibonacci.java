public class Fibonacci {
    public static void main(String[] args) {
        int no=4;
        int first =0,second =1;
        System.out.println("fibonaci series "+ first +""+second);
        for(int i=2;i<no;i++){
            int curr = first+second;
            System.out.print(curr);
            first = second;
            second = first;
        }
    }
}
