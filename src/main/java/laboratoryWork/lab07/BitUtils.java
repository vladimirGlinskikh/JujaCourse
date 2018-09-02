package laboratoryWork.lab07;

public class BitUtils {
    public static byte swapBits(byte b, int i, int j) {
        byte bit1 = (byte) (((1 << i) & b) >> i);
        byte bit2 = (byte) (((1 << j) & b) >> j);

        byte a = b;

        if (bit1 != bit2){
            if (bit1 == 1){
                bit1 <<= j;

                a = (byte)(b | bit1);
                a ^= (1 << i);
            }else {
                bit2 <<= i;
                a = (byte)(b | bit2);
                a ^= (1 << j);
            }
        }
        return a;
    }
}
