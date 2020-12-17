package sorting;

public class Sorter {

    private static String arrayToString(int[] array) {
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

    public static void bubbleSort(int[] array) {
        boolean swapOccured;
        int count = 1;

        do {
            swapOccured = false;
            for (int i=0; i<array.length-1; i++) {
                if (array[i] >= array[i+1]) {  // ascending order
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapOccured = true;
                }
            }

            System.out.println("Pass " + count + ": " + arrayToString(array));
            count = count + 1;
        } while (swapOccured);  // if a swap did not occur, the array is already sorted
    }

    public static void selectionSort(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    int newMin = array[j];
                    array[j] = array[i];
                    array[i] = newMin;
                }
            }

            count = count + 1;
            System.out.println("Pass " + count + ": " + arrayToString(array));
        }
    }

    public static int[] mergeSort(int[] array) {
        // pass
        return array;
    }
    public static int[] quickSort(int[] array) {
        // pass
        return array;
    }
    public static int[] radixSort(int[] array) {
        // pass
        return array;
    }

}
