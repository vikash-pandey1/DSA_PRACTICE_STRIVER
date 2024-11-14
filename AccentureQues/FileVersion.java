public class FileVersion{
    public static int latestVersion(String arr[],int version){
        if(arr.length==0) return -1;
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            String ch = arr[i];
            String lc = ch.charAt(ch.length()-1)+"";
            int vs = Integer.parseInt(lc);
            if(vs>=version) ans = vs;
        }
        if(ans==-1) return version;
        return ans;
    }
    public static void main(String[] args) {
        String arr[]={"file_1","file_3","file_5"};
        System.out.println(latestVersion(arr, 4));
    }
}