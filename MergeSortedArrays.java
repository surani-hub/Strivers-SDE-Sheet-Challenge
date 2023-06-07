import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 3, 6, 9, 0, 0 };
        int[] arr2 = { 4, 10 };

        int n = arr2.length;
        int m = arr1.length - n;

        System.out.println(Arrays.toString(ninjaAndSortedArrays(arr1, arr2, m, n)));
    }

    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int newSize = m + n - 1;
        int arr1Len = m - 1;
        int arr2Len = n - 1;

        while (arr1Len >= 0 && arr2Len >= 0) {
            if (arr1[arr1Len] > arr2[arr2Len]) {
                arr1[newSize] = arr1[arr1Len];
                --arr1Len;
            } else {
                arr1[newSize] = arr2[arr2Len];
                --arr2Len;
            }
            --newSize;
        }

        while (arr2Len >= 0) {
            arr1[newSize--] = arr2[arr2Len--];
        }
        return arr1;
    }
}
