public class MaxElement {
    public static int max(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(max(arr));
    }
}
