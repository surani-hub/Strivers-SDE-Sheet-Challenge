import java.util.ArrayList;
import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        mat.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        mat.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        int target = 8;

        System.out.println(searchMatrix(mat, target));
        
    }

    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int m = mat.size();
        if (m == 0) {
            return false;
        }
        int n = mat.get(0).size();

        int start = 0;
        int end = n * m - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mat.get(mid / n).get(mid % n) == target) {
                return true;
            }
            if (mat.get(mid / n).get(mid % n) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}