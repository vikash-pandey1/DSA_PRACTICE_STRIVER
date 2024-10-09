public class ReplacFreqChar {
    public static String replace(String str, String x ){
        int count[]=new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        int max =count[0];
        char maxChar=(char)('a'+0);
        for(int i=0;i<count.length;i++){
            if(count[i]>max){
                max = count[i];
                maxChar = (char)('a'+i);
            }
        }
        String ans ="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==maxChar){
                ans = ans+x;
            }else{
                ans = ans+str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str  = "abb";
        String x = "z";
        System.out.println(replace(str, x));
    }
}
