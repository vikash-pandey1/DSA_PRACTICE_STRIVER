import java.util.*;
public class ExpandStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder output = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){
                int j=i+1;

                StringBuilder num = new StringBuilder();
                while(j<str.length() && Character.isDigit(str.charAt(j))){
                    num.append(str.charAt(j));
                    j++;
                }

                int count = Integer.parseInt(num.toString());
                for(int k=0;k<count;k++){
                    output.append(ch);
                }
                i=j-1;
            }
        }

        System.out.println(output.toString());
        sc.close();
    }
}
