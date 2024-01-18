public class Rotate_deg {
    public static void transpose(int arr[][]){
        for(int i=0;i<arr[i].length-1;i++){
            for(int j=i;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverse(int arr[]){
        int i =0,j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int arr[][]){
        transpose(arr);
        for(int i=0;i<arr.length;i++){
            reverse(arr[i]);
        }
        print(arr);

    }
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }
}

