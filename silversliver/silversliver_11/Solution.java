package silversliver.silversliver_11;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maxArea(int[] height) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] height = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(maxArea(height));
    }
}
