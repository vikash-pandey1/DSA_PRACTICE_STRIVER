public class MoveZeroAtEnd {
    public static void main(String[] args) {
        int arr[]={1,3,0,2,3,0};
        int pointer =0;
        for(int num:arr){
            if(num!=0){
                arr[pointer++]=num;
            }
        }
        while (pointer<arr.length) {
            arr[pointer++]=0;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
