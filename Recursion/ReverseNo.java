package Recursion;

public class ReverseNo {
    public static void reverse(int i, int arr[], int n) {
        if (i >= n / 2)
            return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reverse(i + 1, arr, n);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(0, arr, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
