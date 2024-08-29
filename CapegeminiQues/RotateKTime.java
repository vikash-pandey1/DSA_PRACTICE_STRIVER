package CapegeminiQues;

public class RotateKTime {
    public static void rotate(int n,int arr[],int k){
        k=k%n;
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
        int arr[]={1,3,5,7,9};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        rotate(arr.length, arr, 2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
