public class Solution {
    public static int[] minOperations(String boxes) {
        int ans[] = new int[boxes.length()];
        char arr[] = boxes.toCharArray();
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;i++){
                if((i-'0') == (j-'0')){
                   break;
                }
                if((arr[i]-'0')==1){
                    count+=(j-'0');
                }
            }
            ans[(arr[i]-'0')]=count;
            count=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "110";
        int arr[] = minOperations(s);
        for(int i=0;i<s.length();i++){
            System.out.println(arr[i]);
        }
    }
}
