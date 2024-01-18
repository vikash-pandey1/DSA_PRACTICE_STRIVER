public class MissingNumber {

    public static int checkNO(int arr[],int n){

        //brute force
        // for(int i=1;i<n;i++){
        //     int flag =0;
        //     for(int j=0;j<n-1;j++){
        //         if(arr[j]==i){
        //             flag =1;
        //             break;
        //         }
        //     }
        //     if(flag==0){
        //         return i;
        //     }
        // }
        // return -1;
        
        // optimize
        int totalSum = (n*(n+1))/2;
        int sum =0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        return totalSum-sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8};
        int n = 8;
        int ans = checkNO(arr, n);
        System.out.println(ans);
    }
}
