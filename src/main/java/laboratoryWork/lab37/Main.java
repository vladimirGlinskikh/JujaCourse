package laboratoryWork.lab37;

public class Main {
    public static void main(String[] args) {
        String actual = StringUtils.rightShift("ABC", -1);
        String expected = "BCA";

        if (!actual.equals(expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");



//        String actual = StringUtils.rightShift("A", -1000000);
//        String expected = "A";
//
//        if (!actual.equals(expected)) {
//            throw new AssertionError();
//        }
//
//        System.out.print("OK");



//        String actual = StringUtils.rightShift("ABC", -100);
//        String expected = "BCA";
//
//        if (!actual.equals(expected)) {
//            throw new AssertionError();
//        }
//
//        System.out.print("OK");
    }
}
