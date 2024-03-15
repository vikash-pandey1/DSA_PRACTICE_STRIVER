public class PrimeNo {
    public static boolean isPrime(int no){
        int check =0;
        for(int i=2;i<no;i++){
            if(no%i==0){
                check++;
            }
        }
        if(check==0){
            return true;
        }
        return false;
    }

    public static void countPrimeNO(int no){
        int ans =0;
        int arr[] = new int[5];
        int arr1[] = new int[5];
        for(int i=1;i<=no;i++){
            int cnt =0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==0){
                arr[ans++]=i;
            }
        }
        System.out.println();
        int i=0;
        int j=4;
        ans =0;
        while(i<j){
            if(arr[i]*arr[j]==no){
                arr1[ans++]=arr[i];
                arr1[ans++]=arr[j];
                i++;
                j--;
            }else if(arr[i]*arr[j]<no){
                i++;
            }else{
                j--;
            }
        }
        for(i=0;i<arr1.length;i++){
            if(arr1[i]>0){
                System.out.print(arr1[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        // System.out.println(isPrime(103));
        // System.out.println(countPrimeNO(10));
        countPrimeNO(10);
    }
}
