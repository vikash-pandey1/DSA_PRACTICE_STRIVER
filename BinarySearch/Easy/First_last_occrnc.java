package BinarySearch.Easy;

public class First_last_occrnc {
    public static int lowerBound(int arr[],int x){
        int first = -1;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                first = mid;
                high = mid-1;
            }else if(arr[mid]<x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return first;
    }
    public static int upperBound(int arr[],int x){
        int last = -1;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                last = mid;
                low  = mid+1;
            }else if(arr[mid]<x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return last;
    }
    public static int[] firstanslast(int arr[],int target){
        int first = lowerBound(arr, target);
        if(first==-1) return new int[] {-1,-1};
        int sec = upperBound(arr, target);
        return new int[] {first,sec};
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 8, 8, 11, 13};
        int ans [] = firstanslast(arr, 8);
        System.out.println("the first ans last position is "+ ans[0]+" "+ans[1]);
    }
}