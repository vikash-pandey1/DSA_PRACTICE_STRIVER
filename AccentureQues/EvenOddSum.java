public class EvenOddSum {
    public static void sum(int arr[]){
        int sumEven =0,sumOdd=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sumEven+=arr[i];
            }else{
                sumOdd+=arr[i];
            }
        }
        System.out.println("Sum of Even:"+sumEven+ " Sum of Odd: "+sumOdd);
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,23};
        sum(arr);
    }
}
