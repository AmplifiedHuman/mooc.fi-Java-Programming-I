import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = { 8, 3, 7, 9, 1, 2, 4 };
        sort(values);
        System.out.println(Arrays.toString(values));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int min = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int minIndex = index;
        int min = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }
}
