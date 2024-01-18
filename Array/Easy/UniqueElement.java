public class UniqueElement {
    public static int uniqueElement(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int arr[]  = {1,2,2,3,3,3};
        System.out.println(uniqueElement(arr));
        }
}
