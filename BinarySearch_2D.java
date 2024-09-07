
class BinarySearch_2D {
    public static void main(String aargs[]) {
        int arr[][] = { { 2, 3, 4 }, { 5, 8, 9 } };
        int target = 5;
        int result[] = binary2d(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] binary2d(int arr[][], int target) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (target == arr[i][j]) {

                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}