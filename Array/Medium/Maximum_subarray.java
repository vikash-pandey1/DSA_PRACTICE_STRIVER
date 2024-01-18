package Array.Medium;
public class Maximum_subarray {
    public static int maximum_subarray(int arr[]){
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sum<0){
                sum=0;
            }
            sum+=arr[i];
            maxSum =Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximum_subarray(arr));
    }
}
