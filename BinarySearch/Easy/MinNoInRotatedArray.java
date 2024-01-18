package BinarySearch.Easy;

public class MinNoInRotatedArray {
    public static int minNo(int arr[]){
        int low =0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        // int idx = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    // idx = low;
                    ans = arr[low];
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]< ans){
                    // idx = low;
                    ans = arr[low];
                }
                low = mid+1;
            }else{
                if(arr[mid]<ans){
                    // idx = mid;
                    ans = arr[mid];
                }
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(minNo(arr));
    }
}
