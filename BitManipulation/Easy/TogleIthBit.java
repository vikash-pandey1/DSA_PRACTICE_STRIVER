package Easy;
public class TogleIthBit {
    public static void togle(int no,int i){
        System.out.println(no^(1<<i-1));
    }
    public static void main(String[] args) {
        togle(13, 2);
    }
}
