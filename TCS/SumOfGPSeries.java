import java.util.Scanner;

public class SumOfGPSeries {
    
    // Function to find the sum of a geometric progression (GP) series
    public static double sumOfGP(double a, double r, int n) {
        if (r == 1) {
            return n * a;
        }
        return a * (1 - Math.pow(r, n)) / (1 - r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first term (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the common ratio (r): ");
        double r = scanner.nextDouble();
        
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        scanner.close();
        
        double sum = sumOfGP(a, r, n);
        System.out.println("The sum of the GP series is: " + sum);
    }
}
