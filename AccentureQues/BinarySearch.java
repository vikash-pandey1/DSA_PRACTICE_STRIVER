public class BinarySearch {
    public static boolean isAvailable(int arr[],int trg){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==trg){
                return true;
            }else if(trg<arr[mid]){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,10,40};
        int trg=2;
        System.out.println(isAvailable(arr, trg));
    }
}
