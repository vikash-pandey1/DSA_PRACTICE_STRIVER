import java.util.*;
public class FindOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>0){
                if(b>0){
                    System.out.println(a*b);;
                }else if(b<0){
                    System.out.println(a-b);
                }
            }else{
                if(b<0){
                    System.out.println(a-b);
                }else{
                    System.out.println(a+b);
                }
            }
        }
        sc.close();
    }
}
