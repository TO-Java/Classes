package L20200703;

import java.util.Scanner;

public class BasicArray {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // simple type
        int x = 10;
        System.out.println(x);

        // reference type
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        int[] arr2 = {1, 5, 7, 8};
        System.out.println(arr2[2]);
        printIntArray(arr1);
        printIntArray(arr2);

        int[] arr3 = new int[5];
        printIntArray(arr3);
        readIntArrayCells(arr3);
        printIntArray(arr3);

        int[] arr4 = readIntArray();
        printIntArray(arr4);

        System.out.println(isOrder(arr4));
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
}
