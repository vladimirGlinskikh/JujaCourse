package quiz05.shift;

public class AppOne {
    public static void main(String[] args) {
        int x = 0b00000000_00000000_00000000_00001110 >> 1;
        System.out.println(Integer.toString(x, 2));
    }
}
