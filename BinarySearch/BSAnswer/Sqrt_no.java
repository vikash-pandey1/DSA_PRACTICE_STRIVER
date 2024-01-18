package BinarySearch.BSAnswer;

public class Sqrt_no {
    // public static int sqrt_linear(int n){
    //     int ans = 1;
    //     for(int i=1;i<n;i++){
    //         if(i*i<=n){
    //             ans = i;
    //         }else{
    //             break;
    //         }
    //     }
    //     return ans;
    // }
    public static int sqrt_binary(int n){
        int ans = 1;
        int low =1,high = n;{
            while (low<=high) {
                int mid = (low+high)/2;
                if(mid*mid<=n){
                    ans =mid;
                    low = mid+1;
                }else{
                    high = mid-1;;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrt_binary(28));
    }
}
