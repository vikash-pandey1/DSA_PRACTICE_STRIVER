import java.util.*;
public class CountOccuDual {
    public static int countOccu(String str){
        int count=0;
        HashSet<Character> hs = new HashSet<Character>();
        for(char ch :str.toCharArray()){
            if(hs.contains(ch)){
                count+=1;
            }else{
                count+=2;
                hs.add(ch);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "rama";
        System.out.println(countOccu(str));
    }
}
