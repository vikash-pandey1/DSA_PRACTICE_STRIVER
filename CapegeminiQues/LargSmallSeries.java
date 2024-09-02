package CapegeminiQues;

import java.util.Arrays;

public class LargSmallSeries {
    public static void printSeries(int arr[],int n){
        int larg=0,small=0;
        if(n%2==0){
            larg=n/2;
            small=n-larg;
        }else{
            small=n/2;
            larg = n-small;
        }
        Arrays.sort(arr);
        int a=0;
        for(int i=n-1;i>larg;i--){
            arr[a]=arr[n];
            a+=2;
        }
        int b =1;
        for(int i=0;i<small;i++){
            arr[b]=arr[i];
            b+=2;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,7,6};
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        printSeries(arr, n);
    }
}
