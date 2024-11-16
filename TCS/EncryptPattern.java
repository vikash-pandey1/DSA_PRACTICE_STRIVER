import java.util.Scanner;

public class EncryptPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        System.out.println("Enter string");
        String str = sc.next();
        int count =0;
        int check=n;
        while (check!=0) {
            count++;
            check/=10;
        }
        int arr[]=new int[count];
        for(int i=count-1;i>=0;i--){
            int rem = n%10;
            arr[i]=rem;
            n/=10;
        }
        int i=0;
        int curr=0;
        while (i<str.length()) {
            char ch = str.charAt(i++);
            if(ch=='R'){
                curr++;
            }else if(ch=='L'){
                curr--;
            }else if(ch=='T'){
                arr[curr]++;
            }else if(ch=='D'){
                arr[curr]--;
            }else if(ch=='S'){
                i++;
                int temp = arr[curr];
                int value = str.charAt(i);
                arr[curr]=arr[value];
                arr[value]=temp;
            }
        }
        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a]+"  ");
        }
        sc.close();
    }
}
