package CapegeminiQues;

public class SolveEquation {
    public static void main(String[] args) {
        // Step 1: Declare and initialize variables a and b
        
        int a = 1;
        int b = 2;

        // Step 2: Calculate each term of the expression
        int term1 = (int) Math.pow(a, 3);        // a^3
        int term2 = (int) Math.pow(a, 2) * b;    // a^2 * b
        int term3 = 2 * (int) Math.pow(a, 2) * b; // 2 * a^2 * b
        int term4 = 2 * a * (int) Math.pow(b, 2); // 2 * a * b^2
        int term5 = a * (int) Math.pow(b, 2);    // a * b^2
        int term6 = (int) Math.pow(b, 3);        // b^3

        // Step 3: Calculate the sum of all terms
        int result = term1 + term2 + term3 + term4 + term5 + term6;

        // Step 4: Print the result
        System.out.println("The result of the equation is: " + result);
    }
}

