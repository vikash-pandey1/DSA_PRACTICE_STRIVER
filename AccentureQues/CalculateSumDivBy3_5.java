public class CalculateSumDivBy3_5 {
    public static int calculateSum(int a,int b){
        int sum =0;
        for(int i=a;i<=b;i++){
            if(i%3==0 && i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(calculateSum(12, 50));
    }
}
