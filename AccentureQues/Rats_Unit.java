public class Rats_Unit{
    public static int cal(int r,int unit,int n,int arr[]){
        if(arr.length==0) return -1;
        int req = r*unit;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(req<=sum){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2,8,3,5,7,4,1,2};
        int n = arr.length;
        int r = 7;
        int unit = 2;
        System.out.println(cal(r, unit, n, arr));
    }
}