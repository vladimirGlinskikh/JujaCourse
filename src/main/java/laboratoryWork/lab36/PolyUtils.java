package laboratoryWork.lab36;

import java.math.BigInteger;

public class PolyUtils {
    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {
        BigInteger[] result = new BigInteger[x.length + y.length - 1];
        int i = 0;
        while (i < x.length) {
            int j = 0;
            while (j < y.length) {
                result[i + j] = !(result[i + j] == null) ? result[i + j].add(x[i].multiply(y[j])) : x[i].multiply(y[j]);
                j++;
            }
            i++;
        }
        return result;
    }
}
