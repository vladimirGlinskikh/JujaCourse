package anotherExperiments.SOLID.OCP.violation.figure;

public class AreaCalculator {

//    public double areaCalculator(Rectangle... rectangles) {
//        double area = 0;
//        for (var rectangle : rectangles) {
//            area += rectangle.getWidth() * rectangle.getHeight();
//        }
//        return area;
//    }

    public double areaCalculator(Object... shapes) {
        double area = 0;
        for (var shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getWidth() * rectangle.getHeight();
            } else {
                Circle circle = (Circle) shape;
                area += Math.pow(circle.getRadius(), 2) * Math.PI;
            }
        }
        return area;
    }
}
