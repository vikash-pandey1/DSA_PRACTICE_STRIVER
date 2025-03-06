public class FindOnesAppears {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,4,4};
        int ones=0;
        for(int i=0;i<arr.length;i++){
            ones = ones ^ arr[i];
        }
        System.out.println(ones);
    }
}
