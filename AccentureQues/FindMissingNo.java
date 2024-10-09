import java.security.PublicKey;

public class FindMissingNo {
    public static int findNo(int arr[]){
        int n= arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int total = (n*(n+1))/2;
        return total-sum;
    }
    public static int find(int arr[]){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans = ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={0,1,3,3,1};
        System.out.println(findNo(arr));
        System.out.println(find(arr));

    }
}
