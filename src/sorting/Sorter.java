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
        if (array.length == 1)
            return 0;

        int pivot = array[right];  // last element
        int i = left - 1;  // cursor for less than pivot, j is for equal to or greater than pivot


        for (int j=left; j<=right - 1; j++) {
            if (array[j] < pivot) {
                i += 1;
                swap(array, j, i);
            }
        }

        swap(array, i+1, right);  // final swap

        return i + 1;
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

    public static int[] mergeSort(int[] array) {
        // pass
        return array;
    }
    /* public static void quickSort(int[] array, int left_index, int right_index) {
        // left and right indexes define the scope of the subarray that is to be sorted
        if (left_index >= right_index)
            // if left and right point to the same index, they point to a subarray with 1 element,
            // which is already sorted by default
            return;

        int pivot_index = partition(array, left_index, right_index);

        quickSort(array, left_index, pivot_index - 1);
        quickSort(array, pivot_index + 1, right_index);

    } */
    public static int[] radixSort(int[] array) {
        // pass
        return array;
    }

}
