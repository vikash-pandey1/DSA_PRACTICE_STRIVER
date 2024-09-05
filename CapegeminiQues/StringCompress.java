package CapegeminiQues;

public class StringCompress {
    public static String compress(String str){
        StringBuilder ans = new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                ans.append(str.charAt(i-1));
                ans.append(count);
                count=1;
            }
        }
        ans.append(str.charAt(str.length()-1));
        ans.append(count);

        return ans.toString();
    }
    public static String compress1(String str){
        StringBuilder ans = new StringBuilder();
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                ans.append(str.charAt(i));
                ans.append(count);
                count=1;
            }
        }
        ans.append(str.charAt(str.length()-1));
        ans.append(count);

        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "aabbbbcccdeeeee";
        System.out.println(compress(str));
        System.out.println(compress1(str));
    }
}
