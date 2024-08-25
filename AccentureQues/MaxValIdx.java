public class MaxValIdx {
    public static void findMaxValandIndex(int arr[]){
        int max = Integer.MIN_VALUE;
        int idx =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                idx = i;
            }
        }
        System.out.println("max elment is: "+max);
        System.out.println("index is: "+idx);
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,63,6,638,6};
        findMaxValandIndex(arr);
    }
}
