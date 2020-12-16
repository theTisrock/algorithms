package sorting;
import sorting.Sorter;

public class Driver {

    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");

        if (array.length > 0) {
            for (int i=0; i<array.length; i++) {
                result.append(array[i]);
                if (i < array.length - 1) {
                    result.append(", ");
                }
            }
        }

        result.append("]");

        return result.toString();
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Before: " + arrayToString(array));
        Sorter.bubbleSort(array, "+");
        System.out.println("After: " + arrayToString(array));

        /* System.out.println("Before: " + arrayToString(array));
        Sorter.selectionSort(array);
        System.out.println("After: " + arrayToString(array));

        System.out.println("Before: " + arrayToString(array));
        Sorter.mergeSort(array);
        System.out.println("After: " + arrayToString(array));

        System.out.println("Before: " + arrayToString(array));
        Sorter.quickSort(array);
        System.out.println("After: " + arrayToString(array));

        System.out.println("Before: " + arrayToString(array));
        Sorter.radixSort(array);
        System.out.println("After: " + arrayToString(array)); */
    }

}
