public class FindMissingNo {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int sum=0;
        int max =arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]>max) max = arr[i];
        }
        int targetSum = max*(max+1)/2;
        System.out.println(targetSum-sum);
    }
}
