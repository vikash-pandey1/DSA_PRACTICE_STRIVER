public class MaxProfix {
    public static int maxProfit(int price[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<price.length;i++){
            min = Math.min(min,price[i]);
            max = Math.max(max,price[i]-min);
            System.out.println(min+"   "+max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={7,1,4,3,6,2,8};
        System.out.println(maxProfit(arr));
    }
}
