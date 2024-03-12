package Easy;

public class Power_2 {
    public static boolean isPower2(int n){
        if(n==0) return false;
        // if((n&n-1)==0){
        //     return true;
        // }else{
        //     return false;
        // }

        while (n > 0) {
            if (n == 1) return true;
            if (n % 2 != 0) break;
            n /= 2;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPower2(16));
    }
}
