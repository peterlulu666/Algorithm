package InsertionSort;

import java.util.Arrays;

public class InsertionSortFor {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int numberToBeSwap = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] <= numberToBeSwap) {
                    break;

                }
                arr[j + 1] = arr[j];

            }
            arr[j + 1] = numberToBeSwap;

        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 3, 2, 9, 5, 4, 7, 8, 6, 10};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
