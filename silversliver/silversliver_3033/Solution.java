package silversliver.silversliver_3033;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (var j = 0; j < n; ++j) {
            var max = -1;
            for (var i = 0; i < m; ++i)
                max = Math.max(max, matrix[i][j]);
            for (var i = 0; i < m; ++i)
                if (matrix[i][j] == -1)
                    matrix[i][j] = max;
        }
        return matrix;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] matrix = jsonArrayToInt2DArray(inputJsonValues[0]);
        return JSON.toJSON(modifiedMatrix(matrix));
    }
}
