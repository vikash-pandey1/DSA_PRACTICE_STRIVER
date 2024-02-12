package Patten;

// public class patten {
//     public static void main(String[] args) { // 1
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patten {
//     public static void main(String[] args) { // 2
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//}

// public class patten {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){  //3
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class patten {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){  //4
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// public class patten {
//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");  // 5
//             }
//             System.out.println();
//         }
//     }
// }
// public class patten {
//     public static void main(String[] args) {  //6 
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class patten {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){  // 7
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class patten {
//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=5-i;j++){  // 8
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patten {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");  // 9
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//             for(int j=5;j>=1;j--){
//                 for(int k=1;k<=5-j;k++){
//                     System.out.print(" ");
//                 }
//                 for(int l=1;l<=2*j-1;l++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//     }
// }

// public class patten {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");  // 10 
//             }
//             System.out.println();
//         }
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patten{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 if((i-j)%2==0)
//                 System.out.print("1"+" ");  // 11
//                 else
//                 System.out.print("0"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patten {
//     public static void main(String[] args) {
//         for(int i=4;i>=1;i--){
//             //int b=i;
//             for(int j=1;j<=5-i;j++){ // 12 not completed fully
//                 System.out.print(j);
//             }
//             for(int j=1;j<=2*i-2;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(i+);
//             }
//             System.out.println();
//         }
//     }
// }

// public class patten{
//     public static void main(String[] args) {
//         int incr = 0;
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){  // 13
//                 System.out.print(incr+1 +" ");
//                 incr++;
//             }
//             System.out.println();
//         }
//     }
// }

public class patten{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print("*");  // 19
            }
            for(int s=1;s<=2*i-2;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=6-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=1;j<=6-i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*i-2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=6-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// public class patten{
//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*i-2;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=5-i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patten{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=4;j++){
//                 if(i==1 || i==5 ||  j==1 || j==4 ){
//                     System.out.print("*");
//                 }
//                 else
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }


