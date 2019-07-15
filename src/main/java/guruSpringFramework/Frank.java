package guruSpringFramework;

public class Frank extends Money {

    public Frank(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    protected String currency() {
        return currency;
    }

    @Override
    public Money times(int multiplier) {
        return Money.frank(amount * multiplier);
    }
}
