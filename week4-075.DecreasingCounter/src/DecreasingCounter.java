public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initial;
    
    public DecreasingCounter(int valueAtStart) {
        value = valueAtStart;
        initial = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        value--;
        if (value < 0) {
            value = 0;
        }
    }

    public void reset() {
        value = 0;
    }

    public void setInitial() {
        value = initial;
    }

    // and here the rest of the methods
}
