import java.util.Scanner;

public class RocksLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rocks");
        int rocks = sc.nextInt();
        System.out.println("Enter the no of test");
        int testCase = sc.nextInt();

        int arr[]=new int[rocks];

        for(int i=0;i<rocks;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<testCase;i++){
            int count=0;
            System.out.println("Enter the range");
            int lower = sc.nextInt();
            int upper = sc.nextInt();
            for(int j=0;j<rocks;j++){
                if(arr[j]>=lower && arr[j]<=upper){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
        sc.close();
    }
}
