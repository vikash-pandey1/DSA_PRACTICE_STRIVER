package Easy;
public class BitManipulation{
    public static int countBit(int no){
        int count =0;
        while(no>0){
            count+=no&1;
            no >>=1;
        }
        return count;
    }
    public static int[] bitManipulation(int num, int i){
        int ans[] = new int[3];
        int a=0;
        if ((num &(1<<i-1)) != 0) {
            ans[a++] = 1;
        } else {
            ans[a++] = 0;
        }
        // set ith position
        ans[a++] = (num|(1<<i-1));
        // extract bit
        ans[a] = (num&~(1<<i-1));
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(countBit(8));
    }
}