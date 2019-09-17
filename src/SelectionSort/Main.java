package SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] numberArray = {2, 7, 4, 1, 5, 3};
        selectionSort(numberArray);
        printSortedArray(numberArray);

    }

    public static void selectionSort(int[] numberArray) {
        for (int boundaryIndex = 0; boundaryIndex < numberArray.length - 1; boundaryIndex++) {
//            find the minimum number of the unsorted array
            int minIdx = minimumIndex(numberArray, boundaryIndex);
//            swap the index of minimum number with the index of boundary number
            swap(numberArray, minIdx, boundaryIndex);

        }

    }

    public static int minimumIndex(int[] numberArray, int boundaryIndex) {
        int minIndex = boundaryIndex;
        for (int unsortedIndex = boundaryIndex + 1; unsortedIndex < numberArray.length; unsortedIndex++) {
            if (numberArray[minIndex] > numberArray[unsortedIndex]) {
                minIndex = unsortedIndex;
            }

        }
        return minIndex;
    }

    public static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;


    }

    public static void printSortedArray(int[] numberArray) {
        System.out.println("The sorted array would be: ");
        for (int number : numberArray) {
            System.out.print(number + " ");
        }

    }


}









