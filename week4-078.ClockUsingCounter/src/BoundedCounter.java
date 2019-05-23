public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        value = 0;
    }

    public void next() {
        value++;
        if (value > upperLimit) {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= upperLimit) {
            value = newValue;
        }
    }

    @Override
    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
}