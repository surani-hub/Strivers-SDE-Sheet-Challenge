import java.util.Arrays;

public class sort0s1s2s {
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 2, 1, 0 };

        sort012(a);

        System.out.println(Arrays.toString(a));
    }

    public static void sort012(int[] a) {
        // Write your code here
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, mid, low);
                ++low;
                ++mid;
            } else if (a[mid] == 1) {
                ++mid;
            } else if (a[mid] == 2) {
                swap(a, mid, high);
                --high;
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
