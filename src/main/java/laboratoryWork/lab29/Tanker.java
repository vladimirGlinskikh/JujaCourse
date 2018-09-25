package laboratoryWork.lab29;

public class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rental) {
        if (DEFAULT_RENTAL < rental) {
            return rental * volume;
        }
        return volume * DEFAULT_RENTAL;
    }
}
