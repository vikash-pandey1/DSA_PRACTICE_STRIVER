import java.util.ArrayList;

public class IntersectionOfArray {
    public static ArrayList<Integer> inter(int arr[],int arr2[]){
        ArrayList<Integer> al = new ArrayList<>();
        int visited[] = new int[arr2.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j] && visited[j]==0){
                    al.add(arr2[j]);
                    visited[j]=1;
                    break;
                }else if(arr2[j]>arr[i]){
                    break;
                }
            }
        }
        return al;


    }
    public static void main(String[] args) {
        int arr[] = {3,4,2,64,324,642};
        int arr2[] = {3,64,64,355,683,53};
        ArrayList<Integer> al = inter(arr, arr2);
        for(int val:al){
            System.out.print(val+" ");
        }
    }
}
