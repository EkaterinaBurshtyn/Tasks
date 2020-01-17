public class D {
    private static double p;
    private static int rk;

    static {
        p = 44.6;
        rk = 12;
        System.out.println(p + "/0" + rk);
    }

    public static void print() {
        System.out.println(p);
    }

    public static void mprint() {
        System.out.println(rk);
    }
}
