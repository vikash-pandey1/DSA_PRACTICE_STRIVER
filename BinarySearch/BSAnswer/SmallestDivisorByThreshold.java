
public class SmallestDivisorByThreshold {
    // public static int smallestDivisorLinear(int arr[],int limit){
    //     int n= arr.length;
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>max){
    //             max = arr[i];
    //         }
    //     }
    //     for(int d = 1;d<=max;d++){
    //         int sum =0;
    //         for(int i=0;i<n;i++){
    //             sum+=Math.ceil((double)(arr[i])/(double)(d));
    //         }
    //         if(sum<=limit){
    //             return d;
    //         }
    //     }
    //     return -1;
    // }
    public static int divByd(int arr[],int div){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)(arr[i])/(double)(div));
        }
        return sum;
    }
    public static int minimumDivisor(int arr[],int threshold){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int low = 1,high = max;
        while(low<=high){
            int mid = (low+high)/2;
            if(divByd(arr, mid)<=threshold){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // System.out.println(smallestDivisorLinear(arr, 8));
        System.out.println(minimumDivisor(arr,8));
    }
}
