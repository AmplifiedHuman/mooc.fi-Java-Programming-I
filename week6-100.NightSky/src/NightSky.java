import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starCount;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        starCount = 0;
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public void printLine() {
        Random random = new Random();
        double probability;
        for (int i = 0; i < width; i++) {
            probability = random.nextDouble();
            if (probability <= density) {
                System.out.print("*");
                starCount++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    public void print() {
        starCount = 0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return starCount;
    }
}