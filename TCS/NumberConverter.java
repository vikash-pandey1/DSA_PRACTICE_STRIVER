import java.util.Scanner;

public class NumberConverter {
    
    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    // Function to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        System.out.println("Decimal equivalent: " + binaryToDecimal(binary));
        int deci = binaryToDecimal(binary);
        System.out.println(decimalToBinary(deci));
        
        scanner.close();
    }
}
