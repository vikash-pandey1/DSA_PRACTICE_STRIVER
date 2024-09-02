package CapegeminiQues;

import java.util.Scanner;

public class DetectVirus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            boolean found=true;
            char c = str[i].charAt(0);
            for(int j=0;j<str[i].length();j+=2){
                if(str[i].charAt(j)!=c){
                    found = false;
                    break;
                }
            }
            System.out.print(c+ " ");

            if(found){
                arr[i]=1;
            }else{
                arr[i]=0;
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
