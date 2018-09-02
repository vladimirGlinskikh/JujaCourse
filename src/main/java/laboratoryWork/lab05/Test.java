package laboratoryWork.lab05;

public class Test {
    public static void main(String[] args) {
        if (IntegerUtils.leftShift(0b00111000_11111111_00000000_10101010 )!=
                0b01110001_11111110_00000001_01010100){
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
