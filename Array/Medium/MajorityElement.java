package Array.Medium;
public class MajorityElement {
    // public static int majorityElement_Bruit(int arr[]){
    //     int n = arr.length;
       
    //     for(int i=0;i<arr.length;i++){
    //          int count= 0;
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count>(n/2)){ 
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }

    public static int majorElement_optimal(int arr[]){
        int count =0;
        int n = arr.length;
        int major = arr[0];
        for(int i=0;i<n;i++){
            if(count==0){
                major = arr[i];
            }
            if(major==arr[i]){
                count++;
            }else{
                count--;
            }
        }
        int count1 = 0;
        for(int i=0;i<n;i++){
            if(major==arr[i]){
                count1++;
            }
        }
        if(count1>(n/2)){
                return major;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,3,2,3,3,3};
        // int ans = majorityElement_Bruit(arr);
        int ans = majorElement_optimal(arr);
        System.out.println(ans);
    }
}
