public class SortArray {
    public static int insertionSort(int arr[]){
        int item = arr[arr.length-1];
        int i=arr.length-2;
        while (i>=0 && arr[i]>item) {
            arr[i+1]=arr[i];
            arr[i]=item;
            i--;
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,3};
        System.out.println(insertionSort(arr));
    }
}
