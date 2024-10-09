public class SumOfDivOfNo {
    public static int sumOfDivisors(int no){
        int sum=0;
        for(int i=2;i<=no;i++){
            if(no%i==0){
                sum+=i;
                System.out.print(sum+" ");
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(48));
    }
}
