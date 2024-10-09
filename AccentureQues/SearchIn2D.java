public class SearchIn2D {
    public static boolean isAvailable(int arr[][],int trg){
        int n = arr.length;
        int m = arr[0].length;
        int low =0,high = n*m-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;
            if(arr[row][col]==trg) return true;
            if(arr[row][col]<trg) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(isAvailable(arr, 90));
    }
}
