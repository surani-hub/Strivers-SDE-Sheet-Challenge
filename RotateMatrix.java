import java.util.ArrayList;
import java.util.Arrays;

class RotateMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        mat.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        mat.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        int n = mat.size();
        int m = mat.get(0).size();
        rotateMatrix(mat, n, m);

        System.out.println(mat);

    }

    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        while (colStart < colEnd && rowStart < rowEnd) {
            int prev = mat.get(rowStart + 1).get(colStart);

            for (int i = colStart; i <= colEnd; i++) {
                int curr = mat.get(rowStart).get(i);
                mat.get(rowStart).set(i, prev);
                prev = curr;
            }

            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                int curr = mat.get(i).get(colEnd);
                mat.get(i).set(colEnd, prev);
                prev = curr;
            }

            colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                int curr = mat.get(rowEnd).get(i);
                mat.get(rowEnd).set(i, prev);
                prev = curr;
            }

            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                int curr = mat.get(i).get(colStart);
                mat.get(i).set(colStart, prev);
                prev = curr;
            }
            colStart++;
        }
    }
}