package Array.Hard;

public class missing_repeatingNo {
    // public static int[] repeatNoBrute(int arr[]){
    //     int rep = -1;
    // int mis = -1;
    // for(int i=1;i<arr.length;i++){
    //     int count =0;
    //     for(int j=0;j<arr.length;j++){
    //         if(arr[j]==i){
    //             count++;
    //         }
    //     }
    //     if(count==2){
    //         rep = i;
    //     }
    //     if(count==0){
    //         mis = i;
    //     }
    //     if(mis!=-1 && rep!=-1){
    //         break;
    //     }
    // }
    // int ans[] = {rep,mis};
    // return ans;
    // }
 
    public static int [] better(int arr[]){
        int n = arr.length;
        int hash[] = new int[n+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        int rep = -1,mis =-1;
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                mis  =i;
            }
            if(hash[i]==2){
                rep = i;
            }
            if(rep!=-1 && mis!=-1){
                break;
            }
        }
        int ans[] = {rep,mis};
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {3, 1, 2,5, 4, 7,6};
        int[] ans = better(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");
    }
}
