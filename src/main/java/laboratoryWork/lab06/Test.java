package laboratoryWork.lab06;

public class Test {
    public static void main(String[] args) {
        if (IntegerUtils.rightShift(
                0b00111000_11111111_00000000_10101010 ) !=
                0b00011100_01111111_10000000_01010101) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
