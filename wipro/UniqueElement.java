
// import java.util.Collections;
import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        int arr[]={3,3,53,53,2,3,34,2,23};
        HashSet<Integer> unique = new HashSet<>();
        for(int num:arr){
            unique.add(num);
        }

        TreeSet<Integer> ts = new TreeSet<>(unique);
        System.out.println(ts);

        List<Integer> li = new ArrayList<>(unique);
        Collections.sort(li);
        // System.out.println(Collections.sort(li));
        System.out.println(li);

    }
}
