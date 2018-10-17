package laboratoryWork.lab37;

public class StringUtils {
    public static String rightShift(String arg, int delta) {
        int result;
        if (arg.length() > 0) {
            long tmp = Math.abs((long) delta) % arg.length();
            result = (int) tmp;
        } else {
            return "";
        }
        if (delta > 0) {
            return arg.substring(arg.length() - result) +
                    arg.substring(0, arg.length() - result);
        } else {
            return arg.substring(result) + arg.substring(0, result);
        }
    }
}
