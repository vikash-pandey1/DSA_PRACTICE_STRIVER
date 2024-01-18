package BinarySearch.Easy;

public class Ceil_Floor {
    public static int ceil(int arr[],int x){
        int n = arr.length;
        int low = 0;
        int ans = -1;
        int high = n-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>=x){
                ans = arr[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int floor(int arr[],int x){
        int n = arr.length;
        int low = 0;
        int ans = -1;
        int high = n-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]<=x){
                ans = arr[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 4, 7, 8, 10};
        System.out.println("the ceil value is: "+ceil(arr, 5));
        System.out.println("the floor value is: "+floor(arr,5));
    }
}
