import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();

        System.out.print("? ");
        String command = reader.nextLine();
        while (!command.equalsIgnoreCase("Quit")) {
            String name;
            String latinName;
            String search;
            if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                name = reader.nextLine();
                System.out.print("Latin Name: ");
                latinName = reader.nextLine();
                db.addBird(name, latinName);
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("What was observed:? ");
                search = reader.nextLine();
                db.addObservation(search);
            } else if (command.equalsIgnoreCase("Statistics")) {
                db.stats();
            } else if (command.equalsIgnoreCase("Show")) {
                System.out.print("What? ");
                search = reader.nextLine();
                db.showBird(search);
            }

            System.out.print("? ");
            command = reader.nextLine();
        }
        reader.close();
    }

}
