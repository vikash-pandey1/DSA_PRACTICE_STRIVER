import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimizeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        System.out.println("Enter the no of operations");
        int k = sc.nextInt();
        PriorityQueue<Integer> maxHeap  = new PriorityQueue<>((one,two)-> two-one);
        for(int i=0;i<n;i++){
            maxHeap.add(sc.nextInt());
        }
        while (k>0 && maxHeap.size()>0) {
            int max = maxHeap.poll();
            maxHeap.add(max/2);
            k--;
        }
        int sum =0;
        while(maxHeap.size()>0){
            sum+=maxHeap.poll();
        }
        System.out.println(sum);
        sc.close();
    }
}
