package quiz05.or;

public class AppThree {
    public static void main(String[] args) {
        int x = 0, y = 0, z = 0, t = 0;

        if ((x++ == 0 | y++ == 0) | (z++ == 0 | t++ == 0)) {

        }
        System.out.print(x + "" + y + "" + z + "" + t);
    }
}
