package silversliver.silversliver_1732;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int largestAltitude(int[] gain) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] gain = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(largestAltitude(gain));
    }
}
