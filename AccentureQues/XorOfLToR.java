public class XorOfLToR {
    public static int xorOfLtoR(int l,int r){
        int ans = l;
        for(int i=l+1;i<=r;i++){
            ans = ans^i;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(xorOfLtoR(4, 8));
    }
}
