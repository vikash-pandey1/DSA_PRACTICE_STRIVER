public class PrimeNo {
    public static boolean isPrime(int no){
        int check =0;
        for(int i=2;i<no;i++){
            if(no%i==0){
                check++;
            }
        }
        if(check==0){
            return true;
        }
        return false;
    }

    public static int countPrimeNO(int no){
        int ans =0;
        for(int i=1;i<=no;i++){
            int cnt =0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==0){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(103));
        System.out.println(countPrimeNO(23));
    }
}
