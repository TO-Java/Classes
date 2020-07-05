package L20200703;

import java.util.Scanner;

public class BasicArray {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr2 = {1, 5, 7, 8};
        printEven(arr2);

//        // simple type
//        int x = 10;
//        System.out.println(x);
//
//        // reference type
//        int[] arr1 = new int[5];
//        arr1[0] = 1;
//        arr1[1] = 2;
//        arr1[2] = 3;
//        arr1[3] = 4;
//        arr1[4] = 5;
//
//        System.out.println(arr2[2]);
//        printIntArray(arr1);
//        printIntArray(arr2);
//
//        int[] arr3 = new int[5];
//        printIntArray(arr3);
//        readIntArrayCells(arr3);
//        printIntArray(arr3);
//
//        int[] arr4 = readIntArray();
//        printIntArray(arr4);
//
//        System.out.println(isOrder(arr4));
    }

    public static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print("(" + arr[i] + ")");
        }
        System.out.println();
    }

    // read the cells of a given array
    public static void readIntArrayCells(int[] arr) {
        System.out.print("Enter " + arr.length + " integers >> ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = in.nextInt();
        }
    }

    // create new array & read the cells of the created array
    public static int[] readIntArray() {
        System.out.print("Enter the array length >> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        readIntArrayCells(arr);
        return arr;
    }

    public static boolean isOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void printEven(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) {
                System.out.format("(%d)", arr[i]);
            }
        }
        System.out.println();
    }

    // search
    public static boolean linearSearch(int key, int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if (key == arr[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns minimum in a non-empty given array
     *
     * @param arr The non-empty given array
     * @return The minimum in the given array
     */
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int minIdx = minIdx(arr, i);
            swap(arr, i, minIdx);
        }
    }

    /**
     * Returns the index of the minimal value in a tail of a given array
     *
     * @param arr The given array
     * @param i   The first position of the tail
     * @return The index of the minimal value in the given tail of the given array
     */
    private static int minIdx(int[] arr, int i) {
        int minIdx = i;
        for (int j = i + 1; j < arr.length; ++j) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        return minIdx;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
