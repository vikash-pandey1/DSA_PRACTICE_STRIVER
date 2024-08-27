public class ReverseString {
    public static String revese(String str){
        int n = str.length();
        String ans = "";
        for(int i=0;i<n;i++){
            ans = str.charAt(i)+ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(revese("ram"));
    }
}
