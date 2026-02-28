package silversliver.silversliver_1689;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int minPartitions(String n) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String n = jsonStringToString(inputJsonValues[0]);
        return JSON.toJSON(minPartitions(n));
    }
}
