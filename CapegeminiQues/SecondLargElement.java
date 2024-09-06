

public class SecondLargElement {
    public static int findSecondLargest(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (secondMax < arr[i] && max != arr[i]) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static int findSecondLarg(int arr[]){
        int max = arr[0];
        int secondMax=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];

            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 35,200, 3583, 93, 59,233 };
        System.out.println(findSecondLargest(arr));
        System.out.println(findSecondLarg(arr));
    }
}
