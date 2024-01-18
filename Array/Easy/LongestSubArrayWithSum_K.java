public class LongestSubArrayWithSum_K {
    // public static void subArray(int arr[],int val){
    //     int len =0;
    //     for(int i=0;i<arr.length;i++){
    //         int sum =0;
    //         for(int j=i;j<arr.length;j++){
    //                 sum+=arr[j];
    //             if(sum==val){
    //                 len = Math.max(len,j-i+1);
    //             }
    //         }
    //     }
    //     System.out.println(len);
    // }
    public static int optimize(int arr[],int val){
        int n = arr.length;
        int left =0,right =0;
        int sum = arr[0];
        int maxLen =0;
        while(right<n){
            while(left<=right && sum>val){
                sum-=arr[left];
                left++;
            }
            if(sum==val){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<n) sum+=arr[right];
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {-1,1,1};
        // subArray(arr, 1);
        System.out.println(optimize(arr, 1));
    }
}
