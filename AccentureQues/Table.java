public class Table {
    public static void printTable(int no){
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.print(" " +no*i);
            sum+=no*i;
        }
        System.out.println();
        System.out.println("sum of table is :"+sum);
    }
    public static void main(String[] args) {
        printTable(12);
    }
}
