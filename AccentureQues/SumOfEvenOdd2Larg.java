import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumOfEvenOdd2Larg {
    public static int calculateSum(int n,int arr[]){
        if(arr.length<4){
            return -1;
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0) even.add(arr[i]);
            else odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println(even);
        System.out.println(odd);
        int ans = even.get(even.size()-2)+odd.get(odd.size()-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(calculateSum(n, arr));
        sc.close();
    }
}
