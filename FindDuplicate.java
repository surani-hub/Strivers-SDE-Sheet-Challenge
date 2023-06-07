import java.util.ArrayList;
import java.util.Arrays;

class FindDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2));

        System.out.println(findDuplicate(arr, arr.size()));
    }

    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int slow = arr.get(0);
        int fast = arr.get(0);

        do {
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));
        } while (fast != slow);

        slow = arr.get(0);
        while (slow != fast) {
            slow = arr.get(slow);
            fast = arr.get(fast);
        }

        return slow;
    }
}