package BinarySearch.Easy;

public class MinNoOfRotationRequire {
    public static int minNoOfRotationRequire(int arr[]){
        int low =0;
        int high = arr.length-1;
        int idx = -1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    idx = low;
                    ans = arr[low];
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    idx = low;
                    ans = arr[low];
                }
                low = mid+1;
            }else{
                if(arr[mid]<ans){
                    idx = mid;
                    ans = arr[mid];
                }
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(minNoOfRotationRequire(arr));
    }
}
