public class MaxMinInNo {
    public static void main(String[] args) {
        int no = 2432;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(no!=0){
            int digit = no%10;
            if(digit<min){
                min = digit;
            }else if(digit>max){
                max = digit;
            }
            no/=10;
        }
        System.out.println("max is "+max + " min is "+min);
    }
}
