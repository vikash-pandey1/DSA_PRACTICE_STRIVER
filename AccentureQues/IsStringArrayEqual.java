
public class IsStringArrayEqual {
    public static boolean areEqual(String a[],String b[]){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<a.length;i++){
            sb.append(a[i]);
        }
        for(int i=0;i<b.length;i++){
            sb2.append(b[i]);
        }
        return sb.toString().equals(sb2.toString());
    }
    public static void main(String[] args) {
        String a[]={"a","bc"};
        String b[]={"ab","c"};
        System.out.println(areEqual(a, b));

    }
}
