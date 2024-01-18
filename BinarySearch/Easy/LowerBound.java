package BinarySearch.Easy;

public class LowerBound {
    public static int lowerBound(int arr[],int x){
        int ans = x;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(lowerBound(arr, 4));
    }
}
