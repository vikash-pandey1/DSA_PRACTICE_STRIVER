public class SecondLargest {
    public static void secondLargest(int arr[]){
        // int max = arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // int secondMax = arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>secondMax && arr[i]!=max){
        //         secondMax = arr[i];
        //     }
        // }
        // System.out.println(secondMax);

        // optimize code
        int largest = arr[0];
        int second = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i]>second){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
    public static void main(String[] args) {
        int arr[] = {1,23,53,26,23,43,53,534,333};
        secondLargest(arr);
    }
}
