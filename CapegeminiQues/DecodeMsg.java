public class DecodeMsg {
    public static void main(String[] args) {
        String msg = "1 2 3 . # 1 # 2 # 3";
        int n = msg.length();
        System.out.println(decode(n, msg));
    }

    public static String decode(int n, String msg) {
        if (msg.equals("") || msg == null) {
            System.out.println("null");
        }
        String str[] = msg.split(" "), s = "";
        int m = str.length;
        for (int i = 0; i < m; i++) {
            if (isNum(str[i])) {
                int num = Integer.parseInt(str[i]);
                if (i - 1 >= 0 && str[i - 1].equals("#")) {
                    s += str[i];
                } else if (num >= 1 && num <= 26) {
                    s+=(char)('A'+num-1);
                }else{
                    return "Invalid";
                }
            }else if(str[i].equals("_")){
                s+= ' ';
            }else{
                s+=str[i];
            }
        }
        msg ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                msg+=s.charAt(i);
            }
        }
        return msg;
    }
    public static boolean isNum(String str){
        try{
            Integer.parseInt(str);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
