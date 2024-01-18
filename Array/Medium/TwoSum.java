package Array.Medium;
public class TwoSum {
    public static int [] bruit(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    int ar[] = {i,j};
                    return ar;
                }
            }
        }
        return null;
    }

    public static int [] optimal(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                int ar[] = {left,right};
                return ar;
            }else if(sum<target) left++;
            else{
                right--;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        int a[] = optimal(arr, 6);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
