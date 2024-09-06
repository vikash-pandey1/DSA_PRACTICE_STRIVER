

import java.util.Arrays;

public class LargSmallSeries {
    public static void printSeries(int arr[], int n) {
        Arrays.sort(arr); // Sort the array in ascending order

        int[] result = new int[n]; 
        int larg = n - 1;  
        int small = 0;    

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = arr[larg--]; 
            } else {
                result[i] = arr[small++]; 
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 7, 6};
        int n = arr.length;

        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Rearranged array:");
        printSeries(arr, n);
    }
}
