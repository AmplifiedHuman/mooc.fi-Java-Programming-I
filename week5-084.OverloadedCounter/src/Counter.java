public class Counter {
    
    private boolean check;
    private int counter;

    public Counter(int startingValue, boolean check) {
        counter = startingValue;
        this.check = check;
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return counter;
    }

    public void increase() {
        counter++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            counter += increaseAmount;
        }
    }

    public void decrease() {
        if (check && counter <= 0) {
            return;
        }
        counter--;
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            return;
        }
        counter -= decreaseAmount;
        if (check && counter < 0) {
            counter = 0;
        }
    }
}