public class MergeSortedArray {
    public static void merge(int arr1[],int arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        int arr[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                arr[k++]=arr1[i++];
            }else{
                arr[k++]=arr2[j++];
            }
        }
        while(i<m){
            arr[k++]=arr1[i++];
        }
        while (j<n) {
            arr[k++]=arr2[j++];
        }
        for(int z=0;z<arr.length;z++){
            System.out.print(arr[z]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,5};
        int arr2[]={3,5,6,6};
        merge(arr, arr2);
    }
}
