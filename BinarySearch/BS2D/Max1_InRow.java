package BinarySearch.BS2D;

public class Max1_InRow {
    public static int lowerBound(int arr[],int n,int x){
        int low =0,high=n;
        int ans = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int maxOneBS(int arr[][],int row,int col){
        int max = -1;
        int idx = -1;
        for(int i=0;i<row;i++){
            int cnt_ones = col-lowerBound(arr[i], col, 1);
            if(cnt_ones>max){
                max = cnt_ones;
                idx = i;
            }
        }
        return idx;
    }
    // public static int max_one(int arr[][]){
    //     int max = -1;
    //     int idx =-1;
    //     for(int i=0;i<arr.length;i++){
    //         int one = 0;
    //         for(int j=0;j<arr[i].length;j++){
    //             one+=arr[i][j];
    //         }
    //         if(one>max){
    //             max = one;
    //             idx = i;
    //         }
    //     }
    //     return idx;
    // }
    public static void main(String[] args) {
        int arr[][] = {{1,0,1,1,1},{1,1,0,0,1},{1,1,0,0,1}};
        System.out.println(max_one(arr));
    }
}
