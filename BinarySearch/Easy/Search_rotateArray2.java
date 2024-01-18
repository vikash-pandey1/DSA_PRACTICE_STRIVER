package BinarySearch.Easy;

public class Search_rotateArray2 {
    public static boolean searchInArray2(int arr[],int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[low] == arr[mid]&& arr[mid]== arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(searchInArray2(arr, 13));
    }
}
