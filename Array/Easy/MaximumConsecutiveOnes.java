public class MaximumConsecutiveOnes {
    public static int MAX_ONES(int arr[]){
        int max = 0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max = Math.max(max,count);
            }else{
                count =0;
            }
        }  
        return max;
      }
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,0,13,53,1,1,0,43,1,1};
        System.out.println(MAX_ONES(arr));
    }
}
