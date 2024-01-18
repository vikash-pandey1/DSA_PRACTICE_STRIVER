package Array.Medium;

import java.util.Arrays;

public class LongestConsecutive {
    public static int Bruit_better(int arr[]){
        int count =0;
        Arrays.sort(arr);
        int n = arr.length;
        int last_small = Integer.MIN_VALUE;
        int longest = 1;
        for(int i=0;i<n;i++){
            if(arr[i]-1==last_small){
                count++;
                last_small= arr[i];
            }else if(arr[i]!=last_small){
                count = 1;
                last_small = arr[i];
            }
            longest = Math.max(count, longest);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        System.out.println(Bruit_better(a));
    }
}
