import java.util.Arrays;

public class AggresiveCows {
    public static boolean canWePlace(int arr[],int dist,int cows){
        int n = arr.length;
        int cntCows =1;
        int last = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-last >=dist){
                cntCows++;
                last = arr[i];
            }
            if(cntCows>=cows) return true;
        }
        return false;
    }
    // public static int aggresiveCows(int arr[],int cows){
    //     int n = arr.length;
    //     Arrays.sort(arr);
    //     int limit = arr[n-1]-arr[0];
    //     for(int i=1;i<limit;i++){
    //         if(canWePlace(arr, i, cows)==false){
    //             return (i-1);
    //         }
    //     }
    //     return limit;
    // }
    public static int aggresiveCowsBS(int arr[],int cows){
        int n = arr.length;
        Arrays.sort(arr);
        int low = 1, high = arr[n - 1] - arr[0];
        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(arr, mid, cows) == true) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return high;
    }
    public static void main(String[] args) {
        int arr[] = {0,3,4,7,10,9};
        int cows = 4;
        int ans = aggresiveCowsBS(arr,cows);
        System.out.println("The maximum possible minimum dist is "+ans);
    }
}
