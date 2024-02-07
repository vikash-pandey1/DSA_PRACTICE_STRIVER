package BinarySearch.BS2D;

public class Max1_InRow {
    public static int lowerBound(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static int maxOneBS(int arr[][], int n, int m) {
        int max = -1;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            int one = m - lowerBound(arr[i], m, 1);
            if (one > max) {
                max = one;
                idx = i;
            }
        }
        return idx;
    }

    public static int max_one(int arr[][]){
    int max = -1;
    int idx =-1;
    for(int i=0;i<arr.length;i++){
    int one = 0;
    for(int j=0;j<arr[i].length;j++){
    one+=arr[i][j];
    }
    if(one>max){
    max = one;
    idx = i;
    }
    }
    return idx;
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1 } };
        // System.out.println(max_one(arr));
        System.out.println(maxOneBS(arr, 3, 5));
    }
}
