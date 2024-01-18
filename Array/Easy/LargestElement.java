public  class LargestElement{
    public static void largest(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,53,23,3232,5};
        largest(arr);
    }
}