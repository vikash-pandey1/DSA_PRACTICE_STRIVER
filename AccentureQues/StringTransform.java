public class StringTransform {
    public static String transform(String str){
        char [] str1 = str.toCharArray();
        for(int i=0;i<str1.length;i++){
            if(str1[i]=='a'){
                str1[i]='b';
            }else if(str1[i]=='b'){
                str1[i]='a';
            }
        }
        return new String(str1);
    }
    public static void main(String[] args) {
        String str = "akaldb";
        System.out.println(transform(str));
    }
}
