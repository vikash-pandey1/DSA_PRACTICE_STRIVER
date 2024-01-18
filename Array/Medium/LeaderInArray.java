package Array.Medium;

import java.util.ArrayList;

public class LeaderInArray {
    public static ArrayList<Integer> leader(int arr[]){
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;

    }
        public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> ans = leader(arr);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}