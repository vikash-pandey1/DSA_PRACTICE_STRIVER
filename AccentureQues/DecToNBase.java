import java.util.ArrayList;

public class DecToNBase {
    public static String toNbase(int n,int num){
        String ans = "";
        ArrayList<Integer> rem = new ArrayList<>();
        while(num!=0){
            rem.add(num%n);
            num = num/n;
        }
        for(int i=0;i<rem.size();i++){
            if(rem.get(i)>9){
                ans = (char)(rem.get(i)-9+64)+ans;
            }else{
                ans = rem.get(i)+ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(toNbase(21, 5678));
    }
}
