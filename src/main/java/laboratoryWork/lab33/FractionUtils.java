package laboratoryWork.lab33;

import java.math.BigInteger;
import java.util.Arrays;

public class FractionUtils {
    public static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {
        BigInteger[] bigIntegers = new BigInteger[2];

        bigIntegers[0] = x[0].multiply(y[1]).add(y[0].multiply(x[1]));
        bigIntegers[1] = x[1].multiply(y[1]);
        BigInteger node =  bigIntegers[0].gcd(bigIntegers[1]);
        bigIntegers[0] = bigIntegers[0].divide(node);
        bigIntegers[1] = bigIntegers[1].divide(node);

        return bigIntegers;
    }

    public static void main(String[] args) {
        BigInteger[] x = {BigInteger.valueOf(2),BigInteger.valueOf(4)};
        BigInteger[] y = {new BigInteger("3"), new BigInteger("4")};
        System.out.println(Arrays.toString(sum(x,y)));
    }
}
