public class OperationChoice {
    public static int calculate(int a,int b,int c){
        if(c==1){
            return a+b;
        }else if(c==2){
            return a-b;
        }else if(c==3){
            return a*b;
        }else {
            return a/b;
        }
    }
    public static void main(String[] args) {
        System.out.println(calculate(23, 3, 1));
        System.out.println(calculate(23, 3, 2));
        System.out.println(calculate(23, 3, 3));
        System.out.println(calculate(23, 3, 4));

    }
}
