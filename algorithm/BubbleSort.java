public class BubbleSort {
    /* it partitions the array in a logical way. It compares each element with the next one and, if the first is greater than the second, it swaps them.
    O(n2) time complexity - quadratic - degrades quickly.
    It is a stable sort algorithm.
     */

    public static void bubble() {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for(int lastUnsorted = array.length -1; lastUnsorted > 0; lastUnsorted--) {
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }
            }
        }

        for (int h : array) {
            System.out.println(h);
        }
    }

    public static void swap(int [] array, int i, int j) {
        if (i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
