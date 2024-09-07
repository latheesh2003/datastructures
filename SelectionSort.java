import java.util.*;

class SelectionSort {
    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 6, -1, -2, -5 };
        selectionsort(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = Maximum(arr, 0, lastIndex);
            swap1(arr, maxIndex, lastIndex);
        }
    }

    public static int Maximum(int[] arr, int start, int lastIndex) {
        int max = start;
        for (int i = start; i <= lastIndex; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap1(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
