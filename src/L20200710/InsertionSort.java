package L20200710;

public class InsertionSort {

    public static void main(String[] args) {
        int [] arr = {4, 1, 2, 0};
        printArr(arr);
        insertionSort(arr);;
        printArr(arr);
        System.out.println(isPolindrome("aXbcdcba"));
    }

    private static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print("("+arr[i]+")");
        }
        System.out.println();
    }

    public static void insertionSort(int [] arr) {
        for(int i = 1; i < arr.length; ++i) {
            insert(arr, i);
        }
    }

    private static void insert(int[] arr, int i) {
        int t = arr[i];
        while (i > 0 && arr[i-1] > t) {
            arr[i] = arr[i-1];
            --i;
        }
        arr[i] = t;
    }

    public static boolean isPolindrome(String s) {
        for(int i = 0; i < s.length() / 2; ++i) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
