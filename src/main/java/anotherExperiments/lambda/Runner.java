package anotherExperiments.lambda;

public class Runner {
    public void run(Executable executable) {
        int a = executable.execute();
        System.out.println(a);
    }
}
