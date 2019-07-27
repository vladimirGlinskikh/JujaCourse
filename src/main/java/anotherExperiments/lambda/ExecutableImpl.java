package anotherExperiments.lambda;

public class ExecutableImpl implements Executable {
    @Override
    public int execute() {
        System.out.println("Hello lambda!");
        return 1;
    }
}
