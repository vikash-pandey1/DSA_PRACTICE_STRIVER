public class ReplaceChar {
    public static String replace(String str,char ch1,char ch2){
        String ans ="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch1) ans = ans+ch2;
            else if(str.charAt(i)==ch2) ans = ans+ch1;
            else{
                ans = ans+str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        String ans = replace(str, ch1, ch2);
        System.out.println(ans);
    }
}
