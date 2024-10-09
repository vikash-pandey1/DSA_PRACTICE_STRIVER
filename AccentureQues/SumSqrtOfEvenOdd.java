public class SumSqrtOfEvenOdd {
    public static int sqrtDiff(int a,int b){
        int even = 0,odd=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                even+=Math.sqrt(i);
            }else{
                odd+=Math.sqrt(i);
            }
        }
        return Math.abs(even-odd);

    }
    public static void main(String[] args) {
        int a = 1;
        int b =10;
        System.out.println(sqrtDiff(a, b));
    }
}
