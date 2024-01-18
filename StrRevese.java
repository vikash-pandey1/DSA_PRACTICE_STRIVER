public class StrRevese {
    public static String reverse(String str){
        
        char [] ch = str.toCharArray();;
        for(int i=0;i<ch.length;i++){
        int left =0;
        int right = i-1;
            if(ch[i]=='i'){
                while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "string";
        System.out.println(reverse(str));
    }
}
