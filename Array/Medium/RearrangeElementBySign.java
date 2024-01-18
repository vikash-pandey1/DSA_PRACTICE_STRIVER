package Array.Medium;

public class RearrangeElementBySign {

    public static int[] bruit(int arr[]){
        int n = arr.length;
        int neg[] = new int[n/2];
        int pos[] = new int[n/2];
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos[a++] = arr[i]; 
            }else{
                neg[b++] = arr[i];
            }
        }
        for(int i=0;i<n/2;i++){
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
        }
        return arr;
    }
    // public static int[] optimize(int arr[]){
    //     int n = arr.length;
    //     int ans[] = new int[n];
    //     int pos =0,neg =1;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]<0){
    //             ans[neg] = arr[i];
    //             neg+=2;
    //         }else{
    //             ans[pos] = arr[i];
    //             pos+=2;
    //         }
    //     }
    //     return ans;
    // }
    
    public static void main(String[] args) {
        int arr[] = {-2,32,5,3,-9,-3};
        // int ans[]= optimize(arr);
        int ans[] = bruit(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
