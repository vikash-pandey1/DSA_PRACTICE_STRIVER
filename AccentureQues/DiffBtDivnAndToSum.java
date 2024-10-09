public class DiffBtDivnAndToSum {
    public static int calculateDiff(int n,int m){
        int sumDivN=0;
        int sumNDivN=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                sumDivN+=i;
            }else{
                sumNDivN+=i;
            }
        }
        return sumNDivN-sumDivN;
    }
    public static void main(String[] args) { 
        System.out.println(calculateDiff(4, 20));
    }
}
