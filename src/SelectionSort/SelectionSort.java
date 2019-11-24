package SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numberArray = {2, 7, 4, 1, 5, 3};
        selectionSort(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
    }

    public static void selectionSort(int[] data) {
        for (int boundary = 0; boundary < data.length; boundary++) {
            // Find the minimum number of the unsorted array
            int minIndex = boundary;
            for (int unsortedIndex = boundary; unsortedIndex < data.length; unsortedIndex++) {
                // Find the index of the minimum number
                if (data[unsortedIndex] < data[minIndex]) {
                    // Swap the index of found minimum number with the index of assumed minimum number
                    minIndex = unsortedIndex;
                }
            }

            // Swap the found minimum number with boundary number
            int temp;
            temp = data[minIndex];
            data[minIndex] = data[boundary];
            data[boundary] = temp;
        }
    }
}
