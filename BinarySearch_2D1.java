import java.util.Arrays;

class BinarySearch_2D1 {
    // USING normal Search method for search an element in 2D Array
    /*
     * public static void main(String aargs[]) {
     * int arr[][] = { { 2, 3, 4 }, { 5, 8, 9 } };
     * int target = 5;
     * int result[] = binarySearchInTwoD(arr, target);
     * System.out.println(Arrays.toString(result));
     * }
     * 
     * public static int[] binarySearchInTwoD(int arr[][], int target) {
     * int[] result = new int[2];
     * for (int i = 0; i < arr.length; i++) {
     * for (int j = 0; j < arr[0].length; j++) {
     * if (target == arr[i][j]) {
     * 
     * return new int[] { i, j };
     * }
     * }
     * }
     * return new int[] { -1, -1 };
     * }
     * }
     */
    // Binary Search method for 2D Array
    public static void main(String aargs[]) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 } };
        int target = 30;
        int result[] = binarySearchInTwoD(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] binarySearchInTwoD(int arr[][], int target) {
        int row = 0;
        int column = arr.length - 1;
        while (row <= arr.length - 1 && column >= 0) {
            if (target == arr[row][column]) {
                return new int[] { row, column };
            } else if (arr[row][column] > target) {
                column--;
            } else if (arr[row][column] < target) {
                row++;
            }
        }
        return new int[] { -1, -1 };
    }
}
