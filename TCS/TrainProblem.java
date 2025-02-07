import java.util.Arrays;
import java.util.Scanner;

public class TrainProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of trains");
        int n = sc.nextInt();

        int arrival[]=new int[n];
        int depart[]=new int[n];

        for(int i=0;i<n;i++){
            arrival[i]=sc.nextInt();
            int stop = sc.nextInt();
            depart[i]=arrival[i]+stop;
        }
        Arrays.sort(arrival);
        Arrays.sort(depart);

        int i=1,j=0,curr=1,minPlat=1;
        while (i<n && j<n) {
            if(arrival[i]<=depart[j]){
                curr++;
                i++;
            }else{
                curr--;
                j++;
            }
            minPlat = Math.max(minPlat, curr);
        }

        System.out.println(minPlat);
        sc.close();
    }
}
