public class LeftRoteteByOnePlace {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void rotate(int arr[],int n){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        print(arr);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,354,33,2,5343};
        rotate(arr, arr.length-1);
    }
}
