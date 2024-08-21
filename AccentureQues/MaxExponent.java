public class MaxExponent {
    public static int countExponent(int no){
        int count=0;
        while (no%2==0 && no!=0) {
            count+=1;
            no/=2;
        }
        return count;
    }
    public static int maxExponent(int a,int b){
        int max=0,ans=0;
        for(int i=a;i<=b;i++){
            int temp = countExponent(i);
            if(temp>max){
                max = temp;
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maxExponent(2, 9));
    }
}
