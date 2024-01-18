package BinarySearch.Easy;

public class PeakElement {
    public static int peakElement(int arr[]){
        int n = arr.length;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int low = 1,high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            if(arr[mid]>arr[mid-1]){
                low = mid+1;
            }else{
                high= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,6,4};
        System.out.println(peakElement(arr));
    }
}
