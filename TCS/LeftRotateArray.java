public class LeftRotateArray {
    public static void leftRotate(int arr[],int k){
        int n = arr.length;
        k = k%n;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[i]=arr[i+k];
        }
        for(int i=0;i<k;i++){
            arr[n-k+i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k =2;
        leftRotate(arr, k);
        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}
