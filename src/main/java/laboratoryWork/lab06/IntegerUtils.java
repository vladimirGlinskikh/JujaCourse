package laboratoryWork.lab06;

public class IntegerUtils {
    public static int rightShift(int arg) {
        int x = 1;
        int y = 0b10000000_00000000_00000000_00000000;
        int z = arg >> 1;

        if (y == (y & arg)){
            z = (z ^ y);
        }
        if (x == (x & arg)){
            z = (z | y);
        }
        return z;
    }
}
