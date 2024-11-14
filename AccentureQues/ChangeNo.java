import java.util.Scanner;

public class ChangeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int fr = sc.nextInt();
        String str = "";
        if(f%3==0 && f%5==0){
            str+="ThreeFive ";
        }else if(f%3==0){
            str+="Three ";
        }else if(f%5==0){
            str+="Five ";
        }else{
            str+=f+" ";
        }
        if(s%3==0 && s%5==0){
            str+="ThreeFive ";
        }else if(s%3==0){
            str+="Three ";
        }else if(s%5==0){
            str+="Five ";
        }else{
            str+=s+" ";
        }
        if(t%3==0 && t%5==0){
            str+="ThreeFive ";
        }else if(t%3==0){
            str+="Three ";
        }else if(t%5==0){
            str+="Five ";
        }else{
            str+=t+" ";
        }
        if(fr%3==0 && fr%5==0){
            str+="ThreeFive ";
        }else if(fr%3==0){
            str+="Three ";
        }else if(fr%5==0){
            str+="Five ";
        }else{
            str+=fr+" ";
        }
        System.out.println(str);
        sc.close();
    }
}
