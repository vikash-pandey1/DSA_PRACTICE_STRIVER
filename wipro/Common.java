import java.util.Scanner;

public class Common {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n-1];
        int arr3[]=new int[n-2];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n-2;i++){
            arr3[i]=sc.nextInt();
        }
        int first =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[i]==arr2[j]){
                    first=0;
                    break;
                }else{
                    first=arr[i];
                }
            }
        }
        int second =0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-2;j++){
                if(arr2[i]==arr3[j]){
                    second=0;
                    break;
                }else{
                    second=arr2[i];
                }
            }
        }

        System.out.println(first);
        System.out.println(second);
        sc.close();
    }
}
