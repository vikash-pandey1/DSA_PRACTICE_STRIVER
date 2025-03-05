public class MinMaxInArray {
    public static void main(String[] args) {
        int arr[]={24,5383,395,23,21,1};
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }else if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("min is "+min+ "  max is  "+max);
    }
}