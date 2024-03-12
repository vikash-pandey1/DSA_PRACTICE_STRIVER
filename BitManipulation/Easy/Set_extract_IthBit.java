package Easy;
public class Set_extract_IthBit {
    public static void setOrExt(int no,int i){
        // set ith bit
        System.out.println("set bit"+ (no|(1<<i-1)));
        // extract ith bit 
        System.out.println("extract bit"+(no&~(1<<i-1)));
    }
    public static void main(String[] args) {
        setOrExt(13, 2);
    }
}
