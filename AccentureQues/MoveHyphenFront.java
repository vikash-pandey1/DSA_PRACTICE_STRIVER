public class MoveHyphenFront {
    public static String moveHypher(String str){
        // StringBuilder hb = new StringBuilder();
        // StringBuilder ltr = new StringBuilder();
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='-'){
        //         hb.append(str.charAt(i));
        //     }else{
        //         ltr.append(str.charAt(i));

        //     }
        // }
        // StringBuilder ans = new StringBuilder();
        // for(int i=0;i<hb.length();i++){
        //     ans.append(hb.charAt(i));
        // }
        // for(int i=0;i<ltr.length();i++){
        //     ans.append(ltr.charAt(i));
        // }

        // return ans.toString();

        String ans = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                ans = str.charAt(i)+ans;
            }else{
                ans = ans+str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "Move-Hyphens-to-Front";
        System.out.println(moveHypher(str));
        System.out.println(moveHypher("String-Compare"));
    }
}
