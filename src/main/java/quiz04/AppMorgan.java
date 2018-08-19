package quiz04;

public class AppMorgan {
    public static boolean f(boolean x, boolean y) {
        return x | !y;
    }

    public static boolean f1(boolean x, boolean y) {
        return !(!x | y);
    }

    public static boolean f2(boolean x, boolean y) {
        return x & !y;
    }

    public static boolean f3(boolean x, boolean y) {
        return !(!x & y);
    }

    public static void main(String[] args) {

        System.out.println(f(false, false));
        System.out.println("--------------------------");
        System.out.println(f1(false, false));
        System.out.println(f2(false, false));
        System.out.println(f3(false, false));
    }
}
