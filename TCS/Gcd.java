public class Gcd {
    public static void main(String[] args) {
        int no1 =22;
        int no2 = 44;
        int result =1;
        for(int i=1;i<no1 && i<no2;i++){
            if(no1%i==0 && no2%i==0){
                result = i;
            }
        }
        System.out.println(result);
    }
}
