package silversliver.silversliver_3184;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int countCompleteDayPairs(int[] hours) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] hours = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(countCompleteDayPairs(hours));
    }
}
