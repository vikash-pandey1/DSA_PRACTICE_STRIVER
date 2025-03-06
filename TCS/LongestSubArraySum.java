public class LongestSubArraySum {
    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9};
        int target =15;
        int maxLength=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==target){
                    maxLength= Math.max(maxLength,j-i+1);
                }
            }
        }
        System.out.println(maxLength);
    }
}
