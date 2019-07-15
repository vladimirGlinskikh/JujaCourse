package guruSpringFramework;

public class Frank extends Money {


    public Frank(int amount) {
        this.amount = amount;
    }

    @Override
    protected String currency() {
        return "CHF";
    }

    @Override
    public Money times(int multiplier) {
        return new Frank(amount * multiplier);
    }
}
