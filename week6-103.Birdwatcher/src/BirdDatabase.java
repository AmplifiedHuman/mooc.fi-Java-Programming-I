import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<BirdInfo> birds;

    public BirdDatabase() {
        birds = new ArrayList<BirdInfo>();
    }

    public void addBird(String name, String latinName) {
        birds.add(new BirdInfo(name, latinName));
    }

    public void addObservation(String search) {
        for (BirdInfo bird : birds) {
            if (bird.getName().equals(search)) {
                bird.incrementCount();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void stats() {
        for (BirdInfo bird : birds) {
            System.out.println(bird);
        }
    }

    public void showBird(String search) {
        for (BirdInfo bird : birds) {
            if (bird.getName().equals(search)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
}