package BinarySearch.BS2D;

public class Srch_2DArr2 {
    public static boolean bs(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        for(int i=0;i<matrix.length;i++){
            ans = bs(matrix[i],target);
            if(ans!=false){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(searchMatrix(arr, 5));
    }
}
