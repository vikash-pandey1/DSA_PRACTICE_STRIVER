public class CalSum {
    public static int sumRec(int no){
        if(no<=0){
            return 0;
        }else {
            return no+sumRec(no-1);
        }
    }
    public static int sumItt(int no){
        int sum=0;
        for(int i=1;i<=no;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumRec(5));
        System.out.println(sumItt(5));
    }
}
