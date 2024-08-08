package CRYPTOGRAPHY;

public class AdditiveCipher {
    // public static String encrypt(String plainText,int key){
    //     StringBuilder cipherText = new StringBuilder();
    //     for(int i=0;i<plainText.length();i++){
    //         char ch = plainText.charAt(i);
    //         if(Character.isUpperCase(ch)){
    //             char c = (char)(((ch-'A'+key)%26)+'A');
    //             cipherText.append(c);
    //         }else if(Character.isLowerCase(ch)){
    //             char c = (char)(((ch-'a'+key)%26)+'a');
    //             cipherText.append(c);
    //         }else{
    //             cipherText.append(ch);
    //         }
    //     }
    //     return cipherText.toString();
    // }


    // public static String decrypt(String cipherText,int key){
    //     StringBuilder plainText = new StringBuilder();
    //     for(int i=0;i<cipherText.length();i++){
    //         char ch = cipherText.charAt(i);
    //         if(Character.isUpperCase(ch)){
    //             char c = (char)(((ch-'A'-key)%26)+'A');
    //             plainText.append(c);
    //         }else if(Character.isLowerCase(ch)){
    //             char c = (char)(((ch-'a'-key)%26)+'a');
    //             plainText.append(c);
    //         }else{
    //             plainText.append(ch);
    //         }
    //     }
    //     return plainText.toString();
    // }




    public static String encrypt(String plainText,int key){
        StringBuffer sb =new StringBuffer();
        for(int i=0;i<plainText.length();i++){
            char ch = plainText.charAt(i);
            char c = (char)(ch+key);
            sb.append(c);
        }
        return sb.toString();
    }

    public static String decrypt(String plainText,int key){
        StringBuffer sb =new StringBuffer();
        for(int i=0;i<plainText.length();i++){
            char ch = plainText.charAt(i);
            char c = (char)(ch-key);
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String plainText = "ram";
        int key = 5;
        String encryptData = encrypt(plainText, key);
        System.out.println(encryptData);
        System.out.println(decrypt(encryptData, key));
    }
}
