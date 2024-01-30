public class KthMissingNo {
    // public static int kthMissingNo(int arr[],int k){
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]<=k){
    //             k++;
    //         }else{
    //             break;
    //         }
    //     }
    //     return k;
    // }
    public static int kthMissingNoBS(int arr[],int k){
        int n = arr.length;
        int low = 0,high = n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int mis = arr[mid]-(mid+1);
            if(mis<k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return k+high+1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        int k=5;
        System.out.println(kthMissingNoBS(arr, k));
    }
}
