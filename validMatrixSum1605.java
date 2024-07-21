public class validMatrixSum1605 {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] res = new int[rowSum.length][colSum.length];
        for (int i = 0; i < rowSum.length; i++) {
            for (int j = 0; j < colSum.length; j++) {
                res[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= res[i][j];
                colSum[j] -= res[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        validMatrixSum1605 obj = new validMatrixSum1605();
        int[] rowSum = {3,8};
        int[] colSum = {4,7};
        int[][] res = obj.restoreMatrix(rowSum, colSum);
        for (int i = 0; i < rowSum.length; i++) {
            for (int j = 0; j < colSum.length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
