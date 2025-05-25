package silversliver.silversliver_2643;

import com.alibaba.fastjson.JSON;
import qubhjava.BaseSolution;

import java.util.Arrays;


public class Solution extends BaseSolution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        var ans = new int[] {-1, -1};
        var idx = -1;
        var sum = -1;
        var m = mat.length;
        for (int i = 0; i < m; i++){
            var cnt = Arrays.stream(mat[i]).sum();
            if (cnt > sum){
                idx = i;
                sum = cnt;
            }
        }
        return new int[] {idx, sum};
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] mat = jsonArrayToInt2DArray(inputJsonValues[0]);
        return JSON.toJSON(rowAndMaximumOnes(mat));
    }
}
