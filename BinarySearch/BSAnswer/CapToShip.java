public class CapToShip {
    public static int findDays(int [] weights,int cap){
        int days =1;
        int load = 0;
        int n= weights.length;
        for(int i=0;i<n;i++){
            if(load+weights[i]>cap){
                days+=1;
                load = weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
    }
    // public static int leastWeight(int weights[],int d){
    //     int max = Integer.MIN_VALUE,sum =0;
    //     for(int i=0;i<weights.length;i++){
    //         sum+=weights[i];
    //         max = Math.max(max,weights[i]);
    //     }
    //     for(int i=max;i<=sum;i++){
    //         if(findDays(weights, i)<=d){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    public static int leastWeightBS(int weight[],int d){
        int max = Integer.MIN_VALUE,sum =0;
        for(int i=0;i<weight.length;i++){
            sum+=weight[i];
            max = Math.max(max,weight[i]);
        }
        int low = max,high = sum;
        while(low<=high){
            int mid = (low+high)/2;
            if(findDays(weight, mid)<=d){
                high =mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = leastWeightBS(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
