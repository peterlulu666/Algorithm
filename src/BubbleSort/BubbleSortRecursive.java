package BubbleSort;

import java.util.Arrays;

public class BubbleSortRecursive {
    public static void bubbleSort(int[] arr, int arrLength) {
        if (arrLength == 1) {
            return;

        }
        for (int i = 0; i < arrLength - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;

            }
            bubbleSort(arr, arrLength - 1);

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 5, 4, 7, 8, 6, 10};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));


    }
}
