package guruSpringFramework;

public class Frank {
    public int amount;

    public Frank(int amount) {
        this.amount = amount;
    }

    public Frank times(int multiplier) {
        return new Frank(amount * multiplier);
    }

    public boolean equals(Object object) {
        Frank frank = (Frank) object;
        return amount == frank.amount;
    }
}
