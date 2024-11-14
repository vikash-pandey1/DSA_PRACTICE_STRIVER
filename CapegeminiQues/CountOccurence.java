

import java.util.HashMap;

public class CountOccurence {
    public static void printOccurrences(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            max=arr[i]>max?arr[i]:max;
        }
        int occu[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            occu[arr[i]]++;
        }
        for(int i=0;i<occu.length;i++){
            if(occu[i]>0){
                System.out.println(i+" occurrenc  "+occu[i]);
            }
        }

    }

    public static void countOccurrence(int arr[]){
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int no:arr){
            hm.put(no,hm.getOrDefault(no,0)+1);
        }
        System.out.println("using hashset");
        for(int key:hm.keySet()){
            System.out.println(key+" occured "+hm.get(key));
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,3,3,2,2,5,9,9};
        printOccurrences(arr);
        countOccurrence(arr);
    }
}
