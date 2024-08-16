public class NoOfCarries {
    public static int calculateCarries(int no1,int no2){
        int count=0;
        while (no1>0 || no2>0) {
            int rem1 = no1%10;
            int rem2 = no2%10;
            if(rem1+rem2+count>9){
                count++;
            }
            no1/=10;
            no2/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(calculateCarries(9, 573));
    }
}
