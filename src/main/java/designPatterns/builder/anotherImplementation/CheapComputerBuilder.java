package designPatterns.builder.anotherImplementation;

public class CheapComputerBuilder extends ComputerBuilder {
    @Override
    public void buildDisplay() {
        computer.setDisplay("LG");
    }

    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("Crown");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("Logitech");
    }
}
