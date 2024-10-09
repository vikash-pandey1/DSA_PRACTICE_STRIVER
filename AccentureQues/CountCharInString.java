public class CountCharInString {
    public static int countChar(String str){
        int n = str.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "ram is my friend";
        System.out.println(countChar(str));
    }
}
