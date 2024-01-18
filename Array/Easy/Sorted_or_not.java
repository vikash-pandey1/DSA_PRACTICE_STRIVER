public class Sorted_or_not {
    public static boolean isSorted(int arr[]){
        boolean ans = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }else{
                ans = false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(isSorted(arr));
    }
}
