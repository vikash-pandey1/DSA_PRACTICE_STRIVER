package BinarySearch.BS2D;

public class Search_2DArray {
    // linear search
    // public static boolean linearSearch(int arr[][],int target){
    // for(int i=0;i<arr.length;i++){
    // for(int j=0;j<arr[i].length;j++){
    // if(arr[i][j]==target){
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // binarySearch
    // public static boolean bs(int arr[],int target){
    // int low =0;
    // int high = arr.length-1;
    // while(low<=high){
    // int mid = (low+high)/2;
    // if(mid==target) return true;
    // else if(arr[mid]<target){
    // low = mid+1;
    // }else{
    // high = mid-1;
    // }
    // }
    // return false;
    // }
    // public static boolean binarySearch(int arr[][],int target){
    // int n = arr.length;
    // int m = arr[0].length;
    // for(int i=0;i<n;i++){
    // if(arr[i][0]<=target && target<=arr[i][m-1]){
    // return bs(arr[i],target);
    // }
    // }
    // return false;
    // }

    //log(n*m)
    public static boolean logn(int arr[][],int target){
        int n = arr.length;
        int m = arr[0].length;
        int low =0,high = n*m-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;
            if(arr[row][col] == target) return true;
            else if(arr[row][col]<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // System.out.println(linearSearch(arr,18));
        // System.out.println(binarySearch(arr, 7));
        System.out.println(logn(arr, 3));
    }
}
