package silversliver.silversliver_3614;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public char processStr(String s, long k) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String s = jsonStringToString(inputJsonValues[0]);
		long k = Long.parseLong(inputJsonValues[1]);
        return JSON.toJSON(processStr(s, k));
    }
}
