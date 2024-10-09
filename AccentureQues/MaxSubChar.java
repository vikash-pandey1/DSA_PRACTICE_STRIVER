import java.util.HashSet;
import java.util.Set;

public class MaxSubChar {
    public static int max_string(String str){
        Set<Character> map = new HashSet<>();
        int max =0;
        int start=0;
        for(int end=0;end<str.length();end++){
            char c = str.charAt(end);
            if(map.contains(c)){
                map.remove(str.charAt(start));
                start++;
            }
            map.add(c);
            max = Math.max(max,map.size());
            // max = Math.max(max,end-start+1);
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "abcabcdab";
        System.out.println(max_string(str));
    }
}
