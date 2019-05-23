
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        return new Money(added.euros + this.euros, added.cents + this.cents);
    }

    public boolean less(Money compared) {
        return (euros * 100 + cents) < (compared.euros * 100 + compared.cents);
    }

    public Money minus(Money decremented) {
        int difference = (euros * 100 + cents) - (decremented.euros *  100 + decremented.cents);
        if (difference < 0) {
            difference = 0;
        }
        return new Money(0, difference);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
