package laboratoryWork.lab35;

import java.math.BigInteger;

public class PolyUtils {
    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        BigInteger result = new BigInteger("0");
        int index = 0;
        while (index < poly.length) {
            result = poly[poly.length - index - 1].multiply(arg.pow(index)).add(result);
            index++;
        }
        return result;
    }
}
