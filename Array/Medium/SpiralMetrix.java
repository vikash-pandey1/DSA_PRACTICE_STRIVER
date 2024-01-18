package Array.Medium;

import java.util.ArrayList;

public class SpiralMetrix {
    public static void spiral(int arr[][]){
        ArrayList<Integer> al = new ArrayList<>();
        int sr =0;
        int sc =0;
        int er = arr.length-1;
        int ec = arr[0].length-1;
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec;j++){
                al.add(arr[sr][j]);
            }
            for(int i=sr+1;i<=er;i++){
                al.add(arr[i][ec]);
            }
            for(int j = ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                al.add(arr[er][j]);
            }
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                al.add(arr[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        spiral(arr);
    }
}
