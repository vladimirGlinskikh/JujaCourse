package laboratoryWork.lab18;

public class ParserTest {
    public static void main(String[] args) {
//        System.out.println(">> 123 = " + Parser.eval("123"));
//        System.out.println(">> 2*3 = " + Parser.eval("2*3"));
//        System.out.println(">> 2*(1+3) = " + Parser.eval("2*(1+3)"));
//        System.out.println(">> 1+(5-2*(13/6)) = " + Parser.eval("1+(5-2*(13/6))"));

        System.out.println(">> 123 = " + Parser.eval("123"));
        System.out.println(">> 2*3 = " + Parser.eval("2*3"));
        System.out.println(">> (1+3)*2 = " + Parser.eval("(1+3)*2"));
        System.out.println(">> ((13/6)*2-5) + 1 = " + Parser.eval("((13/6)*2-5)+1"));
    }
}
