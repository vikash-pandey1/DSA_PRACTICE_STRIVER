import java.util.*;
public class CountOccurnc {
    public static int countOccurrences(int arr[],int trg){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==trg){
                count++;
            }
        }
        return count;
    }
    public static void countOccurrences2(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int key:map.keySet()){
            System.out.println(key+" occurs "+map.get(key)+" times");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,3,2,3,23,2};
        int trg = 2;
        System.out.println(countOccurrences(arr, trg));
        countOccurrences2(arr);
    }
}
