package Medium;

public class BuySellStock {
    public static int maxProfit(int arr[]){
        int n = arr.length;
        int currPrice = arr[0];
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            int cost = arr[i]-currPrice;
            maxProfit = Math.max(maxProfit,cost);
            currPrice = Math.min(currPrice,arr[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] ={7,1,5,2,1};
        System.out.println(maxProfit(arr));
    }
}
