public class Check {
    public static int minPartitions(String n) {
        long no = Long.parseLong(n);
        int ans = 0;
        while (no != 0) {
            long rem = no % 10;
            // if (ans < rem) {
            //     ans = (int) rem;
            // }

            ans = Math.max(ans,(int)rem);
            no /= 10;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(minPartitions("82734"));
    }
}
