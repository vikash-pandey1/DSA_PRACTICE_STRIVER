import Array.Hard.MajorityElement;

public class MinSizeSubArrSum {
    public static int minSubArrayLen(int arr[],int target){
        int start =0,sum=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>=target){
                sum-=arr[start];
                min = Math.min(min, i-start+1);
                start++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,9,3};
        int trg = 12;
        System.out.println(minSubArrayLen(arr, trg));
    }
}
