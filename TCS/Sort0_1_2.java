public class Sort0_1_2 {
    public static void sort0(int arr[]){
        int low =0,high=arr.length-1,mid=0;
        while (mid<=high) {
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low++]=arr[mid];
                arr[mid++]=temp;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high--]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,1,0,2,1,0};
        sort0(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
