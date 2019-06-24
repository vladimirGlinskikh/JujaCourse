package anotherExperiments.SOLID.OCP.violation.figure;

public class Main {
    public static void main(String[] args) {
        var rect1 = new Rectangle(19, 3);
        var rect2 = new Rectangle(12.2, 5);

        var ac = new AreaCalculator();

        System.out.println(ac.areaCalculator(rect1, rect2));
    }
}
