package Array.Medium;

import java.util.*;

public class Count_subArr_Sum {  // count sub Array with given k

    // public static int bruit(int arr[],int k){
    //     int count =0;
    //     for(int i=0;i<arr.length;i++){
    //         int sum =0;
    //         for(int j=i;j<arr.length;j++){
    //             sum+=arr[j];
    //             if(sum==k){
    //                 count++;
    //             }
    //         }
            
    //     }
    //     return count;
    // }

    public static int better(int arr[],int k){
        int count =0;
        int preSum =0;
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            int remove = preSum-k;
            count = count + mpp.getOrDefault(remove,0);
            mpp.put(preSum ,mpp.getOrDefault(preSum,0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int k=3;
        // System.out.println(bruit(arr, k));
        System.out.println(better(arr, k));
    }
}
