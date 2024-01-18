public class MoveNonZero {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void zeros(int arr[]){
        int nz = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp  = arr[i];
                arr[i] = arr[nz];
                arr[nz] = temp;
                nz++;
            }
        }
        for(int i=nz;i<arr.length;i++){
            arr[i] =0;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,0,43,0,234,2,0,23};
        zeros(arr);
        print(arr);
    }
}
