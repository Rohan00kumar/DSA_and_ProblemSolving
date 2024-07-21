import java.util.List;
import java.util.ArrayList;
public class luckyNumberMat1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowMin = new int[m];
        int[] colMax = new int[n];

        for (int i = 0; i < m; i++) {
            rowMin[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
            }
        }

        for (int j = 0; j < n; j++) {
            colMax[j] = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    res.add(matrix[i][j]);
                }
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        luckyNumberMat1380 obj = new luckyNumberMat1380();
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(obj.luckyNumbers(matrix));
    }
    
}
