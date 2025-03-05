public class CheckSorted {
    public static boolean isSorted(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7};
        if(isSorted(arr)){
            System.out.println("array is sorted");
        }else {
            System.out.println("array is not sorted");
        }
    }
}
