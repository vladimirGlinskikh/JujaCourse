package lab11;

public class MathUtils {
    public static int lookFor(int max) {
        int a = 1;
        int b = 1;
        int count = 0;
        while (((a * a) + (b * b)) <= max) {
            while (((a * a) + (b * b)) <= max) {
                count++;
                b++;
            }
            a++;
            b = 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toString(lookFor(14)));
    }
}
