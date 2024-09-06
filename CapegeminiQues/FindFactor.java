public class FindFactor {
    public static void findFactor(int no){
        for(int i=1;i<=no;i++){
            if(no%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        findFactor(54);
    }
}
