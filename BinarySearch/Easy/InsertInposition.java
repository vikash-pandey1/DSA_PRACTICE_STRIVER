package BinarySearch.Easy;

public class InsertInposition {
    public static int insertIn(int arr[],int target){
        int n = arr.length;
        int ans = n;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                ans = mid;
                high = mid-1;;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int target = 2;
        System.out.println("the insert position  of "+target+" is "+insertIn(arr, target));
    }
}
