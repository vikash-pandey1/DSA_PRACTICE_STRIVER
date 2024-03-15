public class XorOfN_NO {
    public static int xorOfN(int n) {
        if (n % 4 == 1)
            return 1;
        else if (n % 4 == 2)
            return n + 1;
        else if (n % 4 == 3)
            return 0;
        else
            return n;

    }

    public static void main(String[] args) {
        System.out.println(xorOfN(5));
    }
}
