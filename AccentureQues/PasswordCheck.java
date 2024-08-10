public class PasswordCheck { 
    // rules
    // atleast 4 characters
    // at least 1 number
    //at least 1 Capital letter
    // do not have slash / or space
    // do not start with number
    public static int check(String str,int n){
        if(n<4){
            return 0;
        }
        if(str.charAt(0)>='0' && str.charAt(0)<='9'){
            return 0;
        }
        int num =0;
            int ltr =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='/' || str.charAt(i)==' '){
                return 0;
            }
            if(str.charAt(i)>='A' && str.charAt(i)<='z'){
                ltr++;
            }
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                num++;
            }
        }
        if(num>0 && ltr>0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(check("aA1_67", 6));
    }
}
