package silversliver.silversliver_3331;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] parent = jsonArrayToIntArray(inputJsonValues[0]);
		String s = jsonStringToString(inputJsonValues[1]);
        return JSON.toJSON(findSubtreeSizes(parent, s));
    }
}
