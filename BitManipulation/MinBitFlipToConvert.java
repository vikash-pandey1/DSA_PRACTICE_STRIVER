public class MinBitFlipToConvert {
    public static int min_Bit(int no,int target){
        int ans = no^target;
        int cnt =0;
        for(int i=0;i<ans;i++){
            if(((1<<i)&ans)!=0){
            cnt++;
        }
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(min_Bit(13, 7));
        System.out.println(25|(1<<2));
        System.out.println(25&~(1<<2));
    }
}
