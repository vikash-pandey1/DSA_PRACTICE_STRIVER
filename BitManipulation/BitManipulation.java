public class BitManipulation{
    public static int countBit(int no){
        int count =0;
        while(no>0){
            count+=no&1;
            no >>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countBit(8));
    }
}