package silversliver.silversliver_3136;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public boolean isValid(String word) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String word = jsonStringToString(inputJsonValues[0]);
        return JSON.toJSON(isValid(word));
    }
}
