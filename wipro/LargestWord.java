import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] words = str.split("\\s+");
        String largestWord ="";
        for(String word:words){
            if(word.length()>largestWord.length()){
                largestWord= word;
            }
        }
        System.out.println(largestWord);
        sc.close();
    }
}
