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


    public static void bubbleSort(int[] array, String order) {
        // how do we know we're done sorting/?
        // we have not performed a swap and we are at the end of the array
        boolean swap = false;
        boolean ascendingOrder = order.equalsIgnoreCase("+");
        boolean descendingOrder = order.equalsIgnoreCase("-");

        System.out.println("Starting bubble sort...");
        do {
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (ascendingOrder && array[i] >= array[i+1]) {  // swap ascending
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swap = true;
                } else if (descendingOrder && array[i] <= array[i+1]) {  // swap descending
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swap = true;
                }
            }

            System.out.println(arrayToString(array));
        } while (swap);

        System.out.println("Sorted!");
    }

    public static int[] selectionSort(int[] array) {
        // pass
        return array;
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
