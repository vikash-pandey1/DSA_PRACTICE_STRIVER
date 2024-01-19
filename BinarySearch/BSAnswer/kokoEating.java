package BinarySearch.BSAnswer;

public class kokoEating {
    public static int findmax(int []arr){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int calculateHours(int arr[],int h){
        int totalH = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            totalH+=Math.ceil((double)(arr[i])/(double)(h));
        }
        return totalH;
    }
    public static int minimumRateBanana(int arr[],int h){
        int low =1,high = findmax(arr);

        while(low<=high){
            int mid = (low+high)/2;
            int totalH = calculateHours(arr, mid);
            if(totalH<=h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateBanana(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
