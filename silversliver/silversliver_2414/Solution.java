package silversliver.silversliver_2414;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int longestContinuousSubstring(String s) {

    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String s = jsonStringToString(inputJsonValues[0]);
        return JSON.toJSON(longestContinuousSubstring(s));
    }
}
