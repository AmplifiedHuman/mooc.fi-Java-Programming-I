import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        String arrayFormat = Arrays.toString(array);
        StringBuilder builder = new StringBuilder(arrayFormat);
        builder.deleteCharAt(0);
        builder.deleteCharAt(arrayFormat.length() - 2);
        System.out.println(builder.toString());
    }
}
