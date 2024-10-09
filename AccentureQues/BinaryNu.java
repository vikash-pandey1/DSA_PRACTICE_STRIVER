public class BinaryNu {
    public static int check(String str){
        if(str.length()==0) return -1;
        int res = str.charAt(0);
        for(int i=1;i<str.length();i++){
            char prev = str.charAt(i);
            i++;
            if(prev=='A'){
                res = res&(str.charAt(i)-'0');
            }else if(prev=='B'){
                res = res|(str.charAt(i)-'0');
            }else{
                res = res ^ (str.charAt(i)-'0');
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        System.out.println(check(str));
    }
}
