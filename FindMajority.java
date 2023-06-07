public class FindMajority {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 9, 2, 2 };
        
        System.out.println(findMajority(arr, arr.length));
    }

    public static int findMajority(int[] arr, int n) {
        // Write your code here.
        int count = 0, ele = 0;
        for (int num : arr) {
            if (count == 0) {
                ele = num;
                ++count;
            } else if (num == ele) {
                ++count;
            } else {
                --count;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == ele) {
                ++count;
            }
        }

        if (count > n / 2) {
            return ele;
        } else {
            return -1;
        }
    }
}
