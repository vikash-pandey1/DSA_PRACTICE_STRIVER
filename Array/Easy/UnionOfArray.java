import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArray {
    public static ArrayList<Integer> union(int arr[],int arr2[],int n,int m){
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        for(int j=0;j<m;j++){
            hs.add(arr2[j]);
        }
        for(int it :hs){
            Union.add(it);
        }
        return Union;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,2,44,324,642};
        int arr2[] = {3,64,64,355,683,53};
        int n = arr.length;
        int m = arr2.length;
        ArrayList<Integer> Union = union(arr, arr2,n,m);
        for(int val:Union){
            System.out.print(val+" ");
        }

    }
}
