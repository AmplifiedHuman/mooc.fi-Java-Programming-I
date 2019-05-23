import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> persons;

    public Phonebook() {
        persons = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        persons.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}