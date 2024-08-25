public class UniqueNo {
    public static int findUniqueNo(String no){
        int sum =0;
        for(int i=0;i<no.length();i++){
            sum=sum+Integer.parseInt(no.charAt(i)+"");
        }
        if(sum==no.length()){
            int count =0;
            int arr[]=new int[10];
            for(int i=0;i<no.length();i++){
                arr[Integer.parseInt(no.charAt(i)+"")]++;
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    count++;
                }
            }
            return count;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(findUniqueNo("1210"));
    }
}
