import java.util.*;
public class CodeAnsSumOriginal {
    public static void main(String[] args) {
        long sum =0;
        @SuppressWarnings("resource")
        int n = new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            @SuppressWarnings("resource")
            final long x= new Scanner(System.in).nextLong();
            String str = Long.toString((long) Math.pow(2, x));
            str="0"+str;
            str = str.substring(str.length()-2);
            sum +=Integer.parseInt(str);
        }
        System.out.println(sum%100);
    }
}
