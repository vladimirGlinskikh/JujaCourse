package laboratoryWork.lab28;

public class Liner extends AbstractShip {
    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    @Override
    public float calculatePayment() {
        if (DEFAULT_RENTAL <= 0) {
            return DEFAULT_RENTAL;
        }
        return passengers * DEFAULT_RENTAL;
    }

    public float calculatePayment(float f) {
        if (f <= 0) {
            return DEFAULT_RENTAL * passengers;
        }
        if (DEFAULT_RENTAL < f) {
            return f * passengers;
        }
        return passengers * DEFAULT_RENTAL;
    }
}
