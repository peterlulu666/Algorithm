package SelectionSort;

public class SelectionSortNoTemp {
    public static void main(String[] args) {
        int[] numberArray = {2, 7, 4, 1, 5, 3};
        selectionSort(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");

        }
    }

    public static void selectionSort(int[] data) {
        for (int boundaryIndex = 0; boundaryIndex < (data.length - 1); boundaryIndex++) {
            int minIndex = boundaryIndex;
            int minNumber = data[boundaryIndex];
            for (int unsortedIndex = boundaryIndex + 1; unsortedIndex < data.length; unsortedIndex++) {
                if (data[unsortedIndex] < minNumber) {
                    minNumber = data[unsortedIndex];
                    minIndex = unsortedIndex;
                }
            }

            data[minIndex] = data[boundaryIndex];
            data[boundaryIndex] = minNumber;
        }
    }
}
