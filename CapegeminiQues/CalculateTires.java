public class CalculateTires{
    public static void calculate(int arr[][]){
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int tires =0;
            for(int j=0;j<arr[i].length;j++){
                if(j==0){
                    tires=tires+4*arr[i][j];
                }else{
                    tires=tires+2*arr[i][j];
                }
            }
            ans[i]=tires;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void calculateMarks(int marks[][]){
        int arr[]=new int[marks.length];
        for(int i=0;i<marks.length;i++){
            int max =marks[i][0];
            for(int j=1;j<marks[i].length;j++){
                max = max>marks[i][j]?max:marks[i][j];
            }
            arr[i]=max;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int dealer[][]={{4,2},{4,0},{1,2}};
        int marks[][]={{50,60,70},{90,98,670,76},{32,5,3}};
        calculate(dealer);
        System.out.println();
        calculateMarks(marks);
    }
}