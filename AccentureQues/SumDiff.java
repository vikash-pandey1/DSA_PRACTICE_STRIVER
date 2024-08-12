public class SumDiff {  // return diff between sum of (element div by 4 or not div by 4)
    public static int checkDiff(int a,int b){
        int totalSum=0;
        int partialSum=0;
        for(int i=1;i<=a;i++){
            if(i%b==0){
                partialSum+=i;
            }else{
                totalSum+=i;
            }
        }
        return Math.abs(totalSum-partialSum);
    }
    public static void main(String[] args) {
        System.out.println(checkDiff(20, 4));
    }
}
