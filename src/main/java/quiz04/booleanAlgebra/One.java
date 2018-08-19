package quiz04.booleanAlgebra;

public class One {
    public static void main(String[] args) {
        String str = null;
        boolean b = (str != null) && (!str.isEmpty());
        System.out.println(b);
    }
}
