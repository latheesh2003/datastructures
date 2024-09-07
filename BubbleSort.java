import java.util.*;

class BubbleSort {
    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 6, 0 };
        bubblesort(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap1(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    public static void swap1(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
