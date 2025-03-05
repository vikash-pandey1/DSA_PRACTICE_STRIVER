import java.util.Scanner;

public class SumOfApSeries {
    
    // Function to find the sum of an arithmetic progression (AP) series
    public static double sumOfAP(double a, double d, int n) {
        return (n / 2.0) * (2 * a + (n - 1) * d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first term (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the common difference (d): ");
        double d = scanner.nextDouble();
        
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        scanner.close();
        
        double sum = sumOfAP(a, d, n);
        System.out.println("The sum of the AP series is: " + sum);
    }
}
