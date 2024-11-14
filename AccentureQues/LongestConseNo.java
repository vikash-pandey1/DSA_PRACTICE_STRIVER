import java.util.*;
public class LongestConseNo {
    public static int longestConsecutiveNo(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int max =0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int currentStreak=1;
                int currentnum=num;
                while (set.contains(currentnum+1)) {
                    currentStreak++;
                    currentnum++;
                }
                max = Math.max(currentStreak, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        
    }
}
