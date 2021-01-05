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
        /* int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("\nBUBBLE SORT");
        System.out.println("Before: " + arrayToString(a));
        System.out.println("executing...");
        Sorter.bubbleSort(a);
        System.out.println("After: " + arrayToString(a));

        int[] b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("\nSELECTION SORT");
        System.out.println("Before: " + arrayToString(b));
        System.out.println("executing...");
        Sorter.selectionSort(b);
        System.out.println("After: " + arrayToString(b)); */

        int[] x = { 7, 6, 5, 4, 3, 2, 1 };
        System.out.println("Non-partitioned: " + arrayToString(x));
        int pivot_index = Sorter.partition(x, 0, 6);
        System.out.println("Pivot index: " + pivot_index + ", Pivot value: " + x[pivot_index]);
        System.out.println("Partitioned: " + arrayToString(x));

        int[] y = { 35, 15, 20, 40, 30, 10, 25} ;
        System.out.println("\nBefore quick sort: " + arrayToString(y));
        Sorter.quickSort(y, 0, 6);
        System.out.println("After quick sort: " + arrayToString(y));

        /*
        System.out.println("Before: " + arrayToString(array));
        Sorter.mergeSort(array);
        System.out.println("After: " + arrayToString(array));

        System.out.println("Before: " + arrayToString(array));
        Sorter.radixSort(array);
        System.out.println("After: " + arrayToString(array)); */
    }

}
