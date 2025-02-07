import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 2.

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n= 5;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==5) continue;
                System.out.print("1");
            }
            System.out.println();
        }
    }
}

// 3. 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 4. 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online


// for an input n = 3 output should be 

// 1112
// 3222
// 3334

class Main {
    public static void main(String[] args) {
        int n = 3;
        int count =1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=1;j<=4;j++){
                    if(j==4){
                        System.out.print(count+1);
                    }else{
                        System.out.print(count);
                    }
                }
            }else{
                for(int j=1;j<=4;j++){
                    if(j==1){
                        System.out.print(count+1);
                    }else{
                    System.out.print(count);
                        
                    }
                }
            }
            count++;
            System.out.println();
        }
    }
}

// 5.  

class Main {
    public static void main(String[] args) {
        int n = 4;
        int count =3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
            }
            count++;
            System.out.println();
        }
        count--;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
            }
            count--;
            System.out.println();
        }
    }
}

