package silversliver.silversliver_1504;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int numSubmat(int[][] mat) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] mat = jsonArrayToInt2DArray(inputJsonValues[0]);
        return JSON.toJSON(numSubmat(mat));
    }
}
