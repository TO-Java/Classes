package L20200621;

import java.util.Scanner;

public class BasicArray {

    public static void main(String[] args) {
        // int array

//        // regular syntax
//        int[] intArr1 = new int[5];

        // short syntax
        int[] intArr2 = {2, 0, 18, 7, 19, 11};
        printArr(intArr2);
        selectionSort(intArr2);
        printArr(intArr2);

//        // long syntax
//        int[] intArr3 = new int[4];
//        intArr3[0] = 1;
//        intArr3[1] = 3;
//        intArr3[2] = 2;
//        intArr3[3] = 7;
//
//        // boolean array
//        boolean[] boolArr = new boolean[5];
//
//        // single cell
//        System.out.println(intArr1[2]);
//        System.out.println(boolArr[2]);
//        intArr1[2] = 123456;
//        System.out.println(intArr1[2]);
//
//        // regular int
//        int x = 123456;
//        System.out.println(x);
//
//        System.out.println("------------------");
////        readArr(intArr2);
//        System.out.println(sigma(intArr2));
//        printArr(intArr2);
//        System.out.println(linearSearch1(5, intArr2));
//        System.out.println(biggest(intArr2));
//        System.out.println(isOrdered(intArr2));
    }

    public static int sigma(int[] arr) {
        int acc = 0;
        for (int i = 0; i < arr.length; ++i) {
            acc += arr[i];
        }
        return acc;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print("(" + arr[i] + ")");
        }
        System.out.println();
    }

    public static Scanner in = new Scanner(System.in);

    public static void readArr(int[] arr) {
        System.out.print("please enter " + arr.length + " numbers >> ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = in.nextInt();
        }
    }

    // Search
    // is found
    // where is found
    // who is the biggest
    // where is the biggest
    public static boolean linearSearch1(int key, int[] arr) {
        boolean isFound = false;
        for (int i = 0; i < arr.length && !isFound; ++i) {
            if (arr[i] == key) {
                isFound = true;
            }
        }
        return isFound;
    }

    public static boolean linearSearch2(int key, int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int biggest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // sort
    public static boolean isOrdered(int[] arr) {
        boolean isOrdered = true;
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                isOrdered = false;
            }
        }
        return isOrdered;
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = minIdx(arr, i);
            swap(arr, i, minIdx);
        }
    }

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
