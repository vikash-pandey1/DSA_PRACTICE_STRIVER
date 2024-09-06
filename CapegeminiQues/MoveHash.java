

public class MoveHash {
    public static String moveHash(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                ans=str.charAt(i)+ans;
            }else{
                ans = ans+str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(moveHash("move#forward#ofstring#"));
    }
}
