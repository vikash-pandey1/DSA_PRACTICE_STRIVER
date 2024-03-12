package Easy;

public class UnsetRightBit {
    public static void unset(int no){
        System.out.println(no&no-1);;
    }
    public static void main(String[] args) {
        unset(12);
    }
}
