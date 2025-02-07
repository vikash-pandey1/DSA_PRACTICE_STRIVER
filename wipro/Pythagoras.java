import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c= (int)Math.sqrt(a*a+b*b);
        if(a*a+b*b==c*c){
            System.out.println(a+" "+ b+ " "+c);
        }
        sc.close();
    }
}
