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

    private static void swap(int[] array, int left_index, int right_index) {
        int temp = array[left_index];
        array[left_index] = array[right_index];
        array[right_index] = temp;
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2];

        while (left < right) {  // lesser values must be to the left of the pivot
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {  // greater values must be to the right of the pivot
                right--;
            }

            if (left <= right) {  // one of the above constraints has been violated
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

                left++;
                right--;
            }
        }

        return left;
    }

    public static void bubbleSort(int[] array) {
        boolean swapOccured;
        int count = 1;

        do {
            swapOccured = false;
            for (int i=0; i<array.length-1; i++) {
                if (array[i] >= array[i+1]) {  // ascending order
                    swap(array, i, i+1);
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
                    swap(array, j, i);
                }
            }

            count = count + 1;
            System.out.println("Pass " + count + ": " + arrayToString(array));
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        int index = partition(array, left, right);

        if (left < index - 1)
            quickSort(array, left, index - 1);
        if (index < right)
            quickSort(array, index, right);
    }

    /*
    public static int[] mergeSort(int[] array) {
        // pass
        return array;
    }

    public static int[] radixSort(int[] array) {
        // pass
        return array;
    }  */

}
