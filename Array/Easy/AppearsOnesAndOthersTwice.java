public class AppearsOnesAndOthersTwice {
    // finding the number that appears ones and others appears twice
    // brute force
    public static int brute(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if(count==1){
                return num;
            }
        }
        return -1;
    }
    public static int optimal(int arr[]){
        int xorr=0;
        for(int i=0;i<arr.length;i++){
            xorr = xorr ^arr[i];
        }
        return xorr;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,4,6,5,5};
        System.out.println(brute(arr));
    }
}
