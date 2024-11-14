public class HourSumAdv {
    public static int sumHours(int arr[]){
        int mod = 1000009;// take right value
        int ans = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp = (arr[i]%60)+(arr[j]%60);
                if(temp%60==0){
                    ans++;
                    ans = ans%mod;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
