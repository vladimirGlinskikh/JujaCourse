package quiz05.shift;

public class AppOne {
    public static void main(String[] args) {
        int x = 0b10101111_11111111_11111111_11110101 >> 1;
        System.out.println(Integer.toString(x, 2));
    }
}
