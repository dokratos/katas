public class SelectionSort {
    /* It traverses the whole unordered array, finds the biggest element and swaps it with the last element in the unsorted partition.
    O(n2) - quadratic - unstable algorithm. It usually performs better than bubble sort.
     */

    public static void select() {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsorted = array.length - 1; lastUnsorted > 0; lastUnsorted--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsorted; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }

            BubbleSort.swap(array, largest, lastUnsorted);
        }

        for (int el : array) {
            System.out.println(el);
        }
    }
}
