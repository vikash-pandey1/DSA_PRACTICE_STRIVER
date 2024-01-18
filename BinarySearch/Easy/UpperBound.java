package BinarySearch.Easy;

public class UpperBound {
    public static int upperBound(int arr[],int x){
        int low = 0;
        int high = arr.length-1;
        int ans = x;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
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
        int x = 4;
        System.out.println("The upperbound of "+x + " is :" +upperBound(arr, x));
    }
}
