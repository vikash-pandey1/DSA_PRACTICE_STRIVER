public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int num:arr){
            sum+=num;
            maxSum= Math.max(sum,maxSum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxSum);
    }
}
