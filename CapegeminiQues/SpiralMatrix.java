

import java.util.ArrayList;

public class SpiralMatrix {
    public static void spiral(int arr[][]){
        ArrayList<Integer> al = new ArrayList<>();
        int sr=0,sc=0,er=arr.length-1,ec=arr[0].length-1;
        while (sr<=er && sc<=ec) {
            for(int j=sc;j<=ec;j++){
                al.add(arr[sr][j]);
            }
            for(int i=sr+1;i<=er;i++){
                al.add(arr[i][ec]);
            }
            for(int j=ec-1;j>=sc;j--){
                if(sr==er)break;
                al.add(arr[er][j]);
            }
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec)break;
                al.add(arr[i][sc]);
            }
            sr++;sc++;er--;ec--;
        }
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{2,3,5},{5,2,3,0},{8,9,4}};
        spiral(matrix);
    }
}

