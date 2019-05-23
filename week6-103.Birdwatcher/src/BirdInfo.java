public class BirdInfo {

    private final String name;
    private final String latinName;
    private int count;

    public BirdInfo(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return name + " (" + latinName + "): " + count + " observations";
    }
}