package Easy;

public class CountSetBit {
    public static int count(int no){
        int cnt =0;
        while(no>1){
            // if((no&1)==1) cnt++;
            // if(no%2==1) cnt++;
            cnt+=no&1;
            // no/=2;
            no= no>>1;
            if(no==1) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(count(7));
    }
}
