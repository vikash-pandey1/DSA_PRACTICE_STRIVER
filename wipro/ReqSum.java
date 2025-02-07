import java.util.Scanner;

public class ReqSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+"  "+arr[j]);
                    break;
                }
            }
        }
    }
}
