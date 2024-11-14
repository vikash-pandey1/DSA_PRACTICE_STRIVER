import java.util.Scanner;

public class BankSlab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double p = sc.nextDouble();
        System.out.println("Enter tenture year:");
        int totalYears = sc.nextInt();
        double arr[]=new double[2];
        for(int j=0;j<2;j++){
        System.out.println("Enter the no of slabs");
            int n1 = sc.nextInt();
        double sum =0;
        int a = 0;
        for(int i=0;i<n1;i++){
            System.out.println("Enter the period");
            int yrs = sc.nextInt();

            System.out.println("Enter the intrest");
            double intrst = sc.nextDouble();

            double sq = Math.pow(1+intrst, yrs*12);
            double emi = (p*(intrst))/(1-1/sq);
            sum+=emi;
        }
        arr[a++]=sum;
        }
        double bankA = arr[0];
        double bankB = arr[1];
        if(bankA<bankB){
            System.out.println("bankA");
        }else{
            System.out.println("bankB");
        }
    }
}
