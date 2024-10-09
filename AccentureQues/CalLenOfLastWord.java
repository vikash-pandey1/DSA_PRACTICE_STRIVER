public class CalLenOfLastWord {
    public static int lengthOfLastWord(String s){
        int len =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                len=0;
            }else{
                len++;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        String s  = "ram is shyam";
        System.out.println(lengthOfLastWord(s));
    }
}
