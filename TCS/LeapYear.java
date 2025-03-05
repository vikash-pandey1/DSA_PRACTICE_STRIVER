import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if((year %4==0 && year %100!=0) || ( year%400==0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
        sc.close();
    }
}
