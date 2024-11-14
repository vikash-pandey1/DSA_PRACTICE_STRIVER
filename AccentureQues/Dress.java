public class Dress {
    public static int minStudent(String stu){
        int value =1;
        for(int i=0;i<stu.length();i++){
            if(stu.charAt(i)=='I'){
                if(value==0){
                    return stu.length()-i;
                }else{
                    value--;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(minStudent("FFFIFFFIFFF"));
    }
}
