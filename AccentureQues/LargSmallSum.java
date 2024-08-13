import java.util.ArrayList;
import java.util.Collections;

public class LargSmallSum {
    public static int calculate(int arr[]){
        if(arr.length<4){
            return 0;
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        even.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(i%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        return even.get(even.size()-2)+odd.get(1);
    }
    public static void main(String[] args) {
        int arr[] = {32,53,25,26,3};
        System.out.println(calculate(arr));
    }
}
