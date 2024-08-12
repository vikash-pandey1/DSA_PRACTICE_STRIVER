public class AbsDiff {
    public static int findCount(int arr[],int n,int num,int diff){
        int count =0;
        for(int i=0;i<n;i++){
            if(Math.abs((num-arr[i]))<=diff){
                count++;
            }
        }
        return count>0 ? count:-1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n= arr.length;
        int num=5;
        int diff = 2;
        System.out.println(findCount(arr, n, num, diff));
    }
}
