package laboratoryWork.lab35;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger[] poly = {new BigInteger("1")};
        BigInteger arg = new BigInteger("10");
        BigInteger expected = new BigInteger("1");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
