public class SmallPairProduct {
    public static int calculate(int arr[],int sum){
        if(arr.length<2) return 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        if(arr[0]+arr[1]<=sum){
            return arr[0]*arr[1];
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int arr[]={9 ,8 ,3 ,-7, 3, 9};
        int sum =4;
        System.out.println(calculate(arr, sum));
    }
}
