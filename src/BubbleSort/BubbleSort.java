package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println("Swap the number " + arr[j] +" in index " + j + " with the number " + arr[j + 1] + " in index " + (j + 1));
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 5, 4, 7, 8, 6, 10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
