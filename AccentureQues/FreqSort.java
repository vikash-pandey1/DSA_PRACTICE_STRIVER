import java.util.*;

public class FreqSort {
    public static String sort(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> charactr = new ArrayList<>(map.keySet());
        charactr.sort((a,b)-> map.get(b)-map.get(a));

        StringBuffer sb = new StringBuffer();
        for(char c:charactr){
            int freq = map.get(c);
            for(int i=0;i<freq;i++){
                sb.append(c);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "frequency";
        System.out.println(sort(s));
    }
}
