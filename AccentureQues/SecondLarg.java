public class SecondLarg {
    public static int secondLargest(int arr[]){
        if(arr.length<=1){
            return -1;
        }
        int max = arr[0];
        int secMax =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            }
            else if(arr[i]>secMax && arr[i]<max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        int arr[]= {3,35,5395,393,5};
        System.out.println(secondLargest(arr));
    }
}
