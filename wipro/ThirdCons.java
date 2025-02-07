import java.util.Scanner;

public class ThirdCons {
    public static boolean isVovel(char ch){
        return ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char output = '\n';
        int count =0;
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(!isVovel(ch)){
                count++;
                if(count==3){
                    output= ch;
                    break;
                }
            }
        }
        System.out.println(output);
        sc.close();
    }
}
