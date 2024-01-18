package BinarySearch.Easy;

public class SingalElement {
    public static int singleElement(int arr[]){
        int n= arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];

        int low =0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            if((mid%2==1 && arr[mid]==arr[mid+1]) || (mid%2==0 && arr[mid]==arr[mid-1])){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleElement(arr));

    }
}
