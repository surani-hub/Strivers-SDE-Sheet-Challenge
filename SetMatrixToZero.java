import java.util.Arrays;
import java.util.HashSet;

public class SetMatrixToZero {
    public static void main(String[] args) {
        int[][] matrix = {
                { 7, 9, 3 },
                { 4, 6, 0 },
                // {}
        };

        setZeros(matrix);
        for (int[] matt : matrix) {
            System.out.println(Arrays.toString(matt));
        }
    }

    public static void setZeros(int matrix[][]) {
        // Write your code here..

        HashSet<Integer> zeroRows = new HashSet();
        HashSet<Integer> zeroCols = new HashSet();

        int n = matrix.length;
        int m = matrix[0].length;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (matrix[row][col] == 0) {
                    zeroRows.add(row);
                    zeroCols.add(col);
                }
            }
        }

        for (int row : zeroRows) {
            for (int i = 0; i < m; i++) {
                matrix[row][i] = 0;
            }
        }

        for (int col : zeroCols) {
            for (int i = 0; i < n; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}