import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println("Enter k");
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        char ch ='\n';
        for(int i=0;i<k;i++){
            ch = sb.charAt(i);
        }
        System.out.println(ch); // first way
        System.out.println(str.charAt(str.length()-k)); // second way
        sc.close();
    }
}
