import java.util.*;
public class Anagram {
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }


    public static boolean isAnagram1(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        int count []=new int[256];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int c:count) {
            if(c!=0) return false;
        }
        return true;
    }

    
    public static void main(String[] args) {
        String str1 = "raja";
        String str2 = "rjar";
        System.out.println(isAnagram1(str1, str2));
    }
}
