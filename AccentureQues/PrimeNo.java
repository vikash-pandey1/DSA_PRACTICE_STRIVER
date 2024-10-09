public class PrimeNo {
    public static void isPrime(int no){
        boolean bool = true;
        if(no<2){
            bool =false;
        }
        
        for(int i=2;i<no;i++){
            if(no%i==0){
                bool=false;
                break;
            }
        }
        if(bool){
            System.out.println("The no is prime");
        }else{
            System.out.println("The no is not prime");
        }
    }

    public static boolean isPrimeOpt(int no){
        if(no<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(no);i++){
            
            if(no%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        isPrime(7);
        int no =9;
        System.out.println(isPrimeOpt(no));
        System.out.println(Math.sqrt(no));
    }
}
