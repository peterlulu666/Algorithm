package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
//            System.out.println("Enter the " + (a_i + 1) + "th number: ");
            a[a_i] = scanner.nextInt();
        }
        // Write Your Code Here
        int count = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
//                    a[j] = swapNumber(a[j + 1], a[j + 1] = a[j]);
                    // Swap a[j] with a[j + 1]
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
                    // Swap a[j] with a[j + 1]
//                    a[j] = a[j] ^ a[j + 1];
//                    a[j + 1] = a[j] ^ a[j + 1];
//                    a[j] = a[j] ^ a[j + 1];
                    numberOfSwaps++;
                    count++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + count +" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);


    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static int swapNumber(int a, int b) {
        return a;

    }

}
