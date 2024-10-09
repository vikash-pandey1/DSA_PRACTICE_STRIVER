public class RowCol0 {
    public static void changeRowCol(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        int rowArr[]=new int[row];
        int colArr[]=new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==0){
                    rowArr[i]=1;
                    colArr[j]=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rowArr[i]==1 || colArr[j]==1){
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }                                                                                     
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,0,5},{5,3,2}};
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        changeRowCol(arr);
    }
}
