package anotherExperiments.lambda;

public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImpl());
        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello Juja!");
                return 1;
            }
        });
        runner.run(() -> {
            System.out.println("Hello Test!");
            return 5;
        });
    }
}
