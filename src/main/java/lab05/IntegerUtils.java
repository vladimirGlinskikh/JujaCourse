package lab05;

public class IntegerUtils {
    public static int leftShift(int arg) {
        int x = arg << 1;
        int y = 0b10000000_00000000_00000000_00000000;
        if ((y & arg) == y) {
            x += 1;
        }
        return x;
    }
}
