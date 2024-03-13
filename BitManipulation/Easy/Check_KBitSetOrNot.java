package Easy;
public class Check_KBitSetOrNot {
    public static boolean check(int no,int i){
        if(((1<<i)&no)!=0){
            return true;
        }else{
            return false;
        }

        // if(((no>>i)&1)==0){
        //     return false;
        // }else{
        //     return true;
        // }

    }
    public static void main(String[] args) {
        System.out.println(check(3, 2));
    }
}
