public class HouseRobber2 {
    public static int houseRobber(int arr[]){
        int prev = arr[0];
        int prev2 = 0;
        for(int i=1;i<arr.length;i++){
            int pick = arr[i];
            if(i>1) pick+=prev2;
            int notPick = 0+prev;
            int curr = Math.max(pick,notPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public static int houseRobber2(int arr[]){
        int n = arr.length;
        int temp [] = new int[n];
        int temp2 [] = new int[n];
        if(n==1) return arr[0];
        for(int i=0;i<n;i++){
            if(i!=0) temp[i] = arr[i];
            if(i!=n-1) temp2[i] = arr[i];
        }
        return Math.max(houseRobber(temp),houseRobber(temp2));
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(houseRobber2(arr));
    }
}
