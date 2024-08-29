package CapegeminiQues;

public class MinStepTo1 {
    // no/x x<no && no%x==0 && no = no-1;
    public static int minstep(int no){
        if(no==0){
            return -1;
        }else if(no==1){
            return 0;
        }else if(no==2){
            return 1;
        }else if(no==3){
            return 2;
        }else{
            if(no%2==0){
                return 2;
            }else{
                return 3;
            }
        }
    }
    public static void testif(int no){
        if(no>0){
            System.out.println("no is gretea than 0 if");
        }else if(no>1){
            System.out.println("no is greten than 1");
        }else if(no>6){
            System.out.println("no is greater than 6");
        }
    }
    public static void testelseif(int no){
        if(no>0){
            System.out.println("no is gretea than 0else if");
        }if(no>1){
            System.out.println("no is greten than 1else if");
        }if(no>6){
            System.out.println("no is greater than 6el e if");
        }
    }
    public static void main(String[] args) {
        System.out.println(minstep(97));
        testif(10);
        testelseif(10);
    }
}
