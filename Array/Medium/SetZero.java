package Array.Medium;

public class SetZero {
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    // public static void bruit(int arr[][]){
    //     int row = arr.length;
    //     int col = arr[0].length;
    //     int arr1[][] = new int[row][col];
    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             arr1[i][j] = arr[i][j];
    //         }
    //     }

    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             if(arr[i][j]==0){
    //                 for(int k=0;k<row;k++){
    //                     arr1[k][j] = 0;
    //                 }
    //                 for(int k=0;k<col;k++){
    //                     arr1[i][k] = 0;
    //                 }
    //             }
    //         }
    //     }
    //     print(arr1);
    // }

    public static void better(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        int arr1[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j] = arr[i][j];
            }
        }

        int r[] = new int[row];
        int c[] = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(r[i]==1 | c[j]==1){
                    arr1[i][j]=0;
                }
            }
        }
        print(arr1);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};
        // bruit(arr);
        better(arr);
    }
}
