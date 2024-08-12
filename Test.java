import java.util.Scanner;

public class Test {
    public  void mishara(){
        System.out.println("hello mishra");
    }
    public static void main(String[] args) {
        // MyObj obj = new MyObj(System.in);
        // int n = obj.nextInt();
        // System.out.println(n);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int r = sc.nextInt();
        float pi = 2.3f;
        System.out.println(pi*(r*r));
        Test t = new Test();
        t.mishara();
        sc.close();
    }
}
