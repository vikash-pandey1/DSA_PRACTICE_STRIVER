package CapegeminiQues;

public class CheckPrime {
    public static void check(int no){
        boolean found=false;
        for(int i=2;i<no;i++){
            if(no%i==0){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("no is not prime");
        }else{
            System.out.println("no is prime");
        }
    }
    public static void main(String[] args) {
        check(6);
    }
}
