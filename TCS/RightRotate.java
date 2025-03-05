public class RightRotate {
    public static void rightRotate(int arr[],int k){
        int n = arr.length;
        k = k%n;
        int temp[]=new int[k];

        for(int i=0;i<k;i++){
            temp[i]=arr[n-k+i];
        }
        for(int i=n-1;i>=k;i--){
            arr[i]=arr[i-k];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k =2;
        rightRotate(arr, k);
        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}
