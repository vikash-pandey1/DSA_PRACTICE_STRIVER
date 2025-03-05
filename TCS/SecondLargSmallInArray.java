public class SecondLargSmallInArray {
    public static void main(String[] args) {
        int arr[]={24,5383,395,23,21,1};
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }else if(arr[i]>max){
                max = arr[i];
            }
        }
        int secondLarg = arr[0];
        int secondSmall = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=min && arr[i]<secondSmall){
                secondSmall = arr[i];
            }else if(arr[i]!=max && arr[i]>secondSmall){
                secondLarg = arr[i];
            }
        }
        System.out.println("second larg "+ secondLarg+ "  seccondsmall "+secondSmall);
    }
}
