/**
 * BuildMatrix2392
 */
public class BuildMatrix2392 {

    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        int[][] matrix = new int[k][k];
        for (int[] rowCondition : rowConditions) {
            int row = rowCondition[0];
            int value = rowCondition[1];
            matrix[row] = new int[k];
            for (int i = 0; i < k; i++) {
                matrix[row][i] = value;
            }
        }
        for (int[] colCondition : colConditions) {
            int col = colCondition[0];
            int value = colCondition[1];
            for (int i = 0; i < k; i++) {
                matrix[i][col] = value;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        BuildMatrix2392 bm = new BuildMatrix2392();
        int k = 3;
        int[][] rowConditions = {{0, 1}, {1, 2}};
        int[][] colConditions = {{1, 1}, {2, 2}};
        int[][] matrix = bm.buildMatrix(k, rowConditions, colConditions);
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}