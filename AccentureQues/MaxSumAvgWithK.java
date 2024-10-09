public class MaxSumAvgWithK {
    public static int findMaxAverage(int arr[],int k){
        double max = Integer.MIN_VALUE;
        int start=0,count=0;
        double sum=0,avg=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            count++;
            if(count==k){
                avg=sum/k;
                max = Math.max(max,avg);
                sum-=arr[start++];
                count--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
