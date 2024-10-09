public class MaxSumSubArray {
    public static int maxSum(int arr[]){
        int sum=0;
        int max =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(arr));
    }
}
